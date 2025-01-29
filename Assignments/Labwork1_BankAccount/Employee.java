public class Employee {
  public String name;
  public int age;
  public double salary;
  static String companyName;

  public Employee(String name,int age,double salary,String c_name){
    this.name = name;
    this.age = age;
    this.salary = salary;
    companyName = c_name;
  }

  public double getYearlySalary(double monthlySalary)
  {
    return this.salary*12;
  }
}
