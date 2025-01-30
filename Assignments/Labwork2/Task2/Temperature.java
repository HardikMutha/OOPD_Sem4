import java.util.Scanner;
public class Temperature {
  // private double temperature;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double temperature;
    temperature = sc.nextDouble();
    int cnt = 0;
    do {
      if(temperature<18)
      {
        System.out.println("Turn on the Heater");
        cnt = 0;
      }
      else if(temperature>28)
      {
        System.out.println("Turn on the cooler");
        cnt = 0;
      }
      else
      {
        System.out.println("Optimal Temperature");
        cnt++;
      }
      temperature = sc.nextDouble();
    } while (cnt<=1);
    sc.close();
  }
}
