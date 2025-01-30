public class Main {
  public static void main(String[] args) {
    Employee E1 = new Employee("Hardik", 21, 10000, "TCS");
    Employee E2 = new Employee("Alhad", 33, 666666, "Google");
    Employee E3 = new Employee("Tanmay", 24, 80000, "Delloite");
    System.out.println(Employee.companyName);
    System.out.println(E1.getYearlySalary(E1.salary));   
    System.out.println(E1.getYearlySalary(E2.salary));
    System.out.println(E1.getYearlySalary(E3.salary));
    System.out.println(E1.name);
  }
}
