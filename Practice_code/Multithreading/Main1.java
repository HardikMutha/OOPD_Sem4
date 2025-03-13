class MyThread extends Thread
{
    @Override
    public void run() 
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("This is thread 1 "+i);
        }
    }
}

class MyThread2 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
            System.out.println("This is thread 2 "+i);
    }
}

public class Main1
{
    public static void main(String[] args) 
    {
        System.out.println("This is the main Thread");
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Main thread has ended");
        // MyThread2 t2 = new MyThread2();
        // t2.start();
    }
}