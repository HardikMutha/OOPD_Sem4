/**
 * Main2
 */
public class Main2 extends Car{

  public Main2(String name,String manufacturer,int year)
  {
    super(name, manufacturer, year);
  }
  @Override
  public void getName()
  {
    System.out.println("Name - Hyundai");
  }

  @Override
  public void getDetails()
  {
    System.out.println("Petrol 1.2L 5 shift manual");
  }
  

  public static void main(String[] args) {
    // Main2 m1 = new Main2("Nice","Not Nice",2014);
    Car c1 = new Car("G-wagon","Merc",2014) { 
      @Override
      public void getName()
      {
        System.out.println("This is name");
      }
      @Override
      public void getDetails()
      {
        System.out.println("This is Mercedes");
      }
    };
    c1.getName();
    c1.getDetails();
    System.out.println(Car.data);
  }
}
