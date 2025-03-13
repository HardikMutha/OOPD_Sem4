public class Flights {
  Flight AllFlights[] = new Flight[3];
  public Flights()
  {
    AllFlights[0] = new Flight("Indigo",10);
    AllFlights[1] = new Flight("JetAirways",12);
    AllFlights[2] = new Flight("AirIndia",5);
  }

  public boolean searchFlight(String FlightName)
  {
    for(int i=0;i<3;i++)
    {
      if(AllFlights[i].getFlightName().equals(FlightName))
      {
        return true;
      }
    }
    return false;
  }
  public int get_available_seats(Flight f1)
  {
    int flag = 0;
    for(int i=0;i<f1.get_number_seats();i++)
    {
      if(f1.seats[i]==1)
      {
        System.out.print((i+1)+" ");
        flag++;
      }
    }
    if(flag==0)
      System.out.print("No Seats Available :(");
    System.out.println();
    return flag;
  }
  public synchronized void bookTicket(int flightNumber,int num_tickets,String name)
  {
    try {
      int seats = this.AllFlights[flightNumber].get_number_seats();
      if(num_tickets>seats)
      {
        throw new Exception("Not Enough Tickets for Flight Number - "+flightNumber);
      }
      else
      {
        for(int i=0;i<this.AllFlights[flightNumber].get_number_seats();i++)
        {
          if(this.AllFlights[flightNumber].seats[i]==1)
          this.AllFlights[flightNumber].seats[i]=0;
        }
        this.AllFlights[flightNumber].set_number_seats(seats-num_tickets);
        double price = AllFlights[flightNumber].ticket_price[flightNumber]*num_tickets;
        System.out.println("Booking Tickets for User "+name);
        System.out.println("The Total Cost for "+num_tickets+" Tickets is "+price);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Such Flight Does not exist");
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}

class User extends Thread
{
  public String username;
  Flights Af = new Flights();
  public int flightNumber;
  public int numberTickets;
  public User(String username,int flightNumber,int numberTickets)
  {
    this.username = username;
    this.flightNumber = flightNumber;
    this.numberTickets = numberTickets;
  }

  @Override
  public void run() {
      Af.bookTicket(flightNumber,numberTickets,username);
  }

}

class Flight
{
  private String flightName;
  private int number_of_seats;
  public int seats[];
  public double ticket_price[];

  public Flight(String flightName,int number_of_seats)
  {
    this.flightName = flightName;
    this.number_of_seats = number_of_seats;
    seats = new int[number_of_seats];
    ticket_price = new double[number_of_seats];
    for(int i=0;i<number_of_seats;i++)
    {
      seats[i] = 1;
      ticket_price[i] = Math.floor(Math.random()*100)+1;
    }
  }


  public String getFlightName() {
    return this.flightName;
  }

  public void setFlightName(String flightName) {
    this.flightName = flightName;
  }

  public void set_number_seats(int number_of_seats)
  {
    this.number_of_seats = number_of_seats;
  }
  public int get_number_seats()
  {
    return  this.number_of_seats;
  }
  
}

