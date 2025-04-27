import java.util.*;

class Counter
{
  private int counter = 0;

  public void updateCounter()
  {
    synchronized(this)
    {
      this.counter++;
    }
  }
  public int getCounter()
  {
    return this.counter;
  }
}


class TestThread implements Runnable 
{
  private Counter c1;
  public TestThread(Counter c1)
  {
    this.c1 = c1;
  }

  public void run()
  {
    for(int i=0;i<1000;i++)
    {
      c1.updateCounter();
    }
  }
}



public class Main 
{
  public static void main(String[] args) 
  {
    Counter c1 = new Counter();
    TestThread t1 = new TestThread(c1);
    TestThread t2 = new TestThread(c1);
    Thread thread1 = new Thread(t1);
    Thread thread2 = new Thread(t2);
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } 
    catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("The value of counter => "+c1.getCounter());
  }
}


