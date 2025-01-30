public class Plant {
  private String name;
  private double moistureLevel;
  Plant(String name,double moistureLevel)
  {
    this.name = name;
    this.moistureLevel = moistureLevel;
  }
  public void checkPlantAndWater()
  {
    if(this.moistureLevel<=30)
    {
      System.out.println("Watering "+this.name);
    }
    else
    {
      System.out.println("Moisture Sufficient for "+this.name);
    }

  }
}
