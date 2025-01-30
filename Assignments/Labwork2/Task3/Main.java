/**
 * Main
 */
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SensorReading sensors[] = new SensorReading[5];
    for(int i=0;i<5;i++)
    {
      String zoneName = sc.next();
      double temperature = sc.nextDouble();
      double humidity = sc.nextDouble();
      double pH = sc.nextDouble();
      sensors[i] = new SensorReading(zoneName, temperature, humidity, pH);
    }
    for(int i=0;i<5;i++)
    {
      if(sensors[i].isTempAbnomral())
      {
        System.out.println(sensors[i].zoneName+" Temperature");
      }
      if(sensors[i].ispHAbnormal())
      {
        System.out.println(sensors[i].zoneName+" pH");
      }
      if(sensors[i].isHumidityAbnormal())
      {
        System.out.println(sensors[i].zoneName + " humidity");
      }
    }
      sc.close(); 
  }
}
