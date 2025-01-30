public class SensorReading {
  
  public String zoneName;
  public double temperature,humidity,pH;
  
  SensorReading(String zoneName,double temperature,double humidity,double pH)
  {
    this.zoneName = zoneName;
    this.temperature = temperature;
    this.humidity = humidity;
    this.pH = pH;
  }
  public boolean isTempAbnomral()
  {
    return ((this.temperature<18 || this.temperature>28)); 
  }
  public boolean isHumidityAbnormal()
  {
    return (this.humidity<50 || this.humidity>80);
  }
  public boolean ispHAbnormal()
  {
    return (this.pH<5.5 || this.pH>7);
  }
}
