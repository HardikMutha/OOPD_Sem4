class A extends Thread
{
  private int x;
  public A(int x)
  {
    this.x = x;
  }
  public void run()
  {
    for(int i=0;i<10;i++)
      System.out.println("Running Thread A with value of i = "+i);
  }
  public int getX()
  {
    return this.x;
  }
  public static void sayHello()
  {
    System.out.println("Hello");
  }
}


class B implements Runnable
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      System.out.println("Running Thread B with value of i = "+i);
    }
  }
}

public class Main {
  public static void main(String[] args) 
  {
    A obj1 = new A(12);
    B obj2 = new B();
    // obj1.start();
    Thread t2 = new Thread(obj2);
    t2.run();
    // t2.start();
  }
}
