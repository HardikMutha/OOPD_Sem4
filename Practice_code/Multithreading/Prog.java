class Temp
{
  static void Nice()
  {
    System.out.println("Static Method from Temp Class");
  }
}



public class Prog extends Temp {

  static void Nice()
  {
    System.out.println("Static Method from Prog Class");
  }

  public static void main(String[] args) {
    Temp.Nice();
    Prog.Nice();
  }
}
