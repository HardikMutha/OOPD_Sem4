public class Main {
  public static void main(String[] args) 
  {
    Plant plants[] = new Plant[5];
    plants[0] = new Plant("DeepSeek", 34.21);
    plants[1] = new Plant("Rose", 100);
    plants[2] = new Plant("Lily", 12.32);
    plants[3] = new Plant("Marigold", 57.44);
    plants[4] = new Plant("Daisy",88.32);
    for(int i=0;i<5;i++)
    {
      plants[i].checkPlantAndWater();
    }
  }
}
