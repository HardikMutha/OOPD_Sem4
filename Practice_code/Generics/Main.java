import java.util.ArrayList;
import java.util.List;

public class Main {
  
  private static class InnerMain {

    private int x;
    private int y;
    public void HelloWorld()
    {
      System.out.println("This is Hello From Private Class");
    }
    public void set_x_y(int x,int y)
    {
      this.x = x;
      this.y = y;
    }
    public void printXY()
    { 
      System.out.println("The value of x = "+x+"\n The value of y = "+y);;
    }
  }

  public static void main(String[] args) 
  {
    InnerMain m1 = new InnerMain();
    m1.set_x_y(12, 42);
    m1.printXY();
    m1.HelloWorld();
    List<Integer> l1 = new ArrayList<>(); 
  }
  
}
