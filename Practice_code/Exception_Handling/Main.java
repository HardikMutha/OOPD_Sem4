import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // int a = 10;
    // int b = 5;
    // int c = 5;
    // int x,y;
    // try {
    //   x = a/(b-c);
    //   System.out.println("The value of x = "+x);
    // } catch (Exception e) {
    //   System.out.println("I am here bro");
    //   System.out.println(e.getMessage());
    // }
    // y = a/(b-c);
    // System.out.println("The value of y = "+y);
    String s = null;
    try {
      System.out.println("The lenght of the String = "+s.length());
    } catch (NullPointerException e) {
      System.out.println("Error Occured -> "+e.getMessage());
    }
    sayHello();
    // throw new Exception("This is an Exception Nigga")
  }
  public static void sayHello() throws IOException
  {
    throw new IOException("This is very bad bro");
  }

}


