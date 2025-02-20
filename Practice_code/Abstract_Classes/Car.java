
public abstract class Car {

  private String name;
  private String manufacturer;
  private int year;
  static final int DATA = 12;
  


  public Car(String name,String manufacturer,int year)
  {
    this.name = name;
    this.manufacturer = manufacturer;
    this.year = year;
  }

  abstract public void getName();
  abstract public void getDetails();

  public void getYear()
  {
    System.out.println(this.year);
    // System.out.println("Hellow Owl");
  }

}
