abstract class Hello
{
    // abstract void sayHelloAbs();
    public void sayHello()
    {
        System.out.println("Hello Bro How's life");
    }
}


class Shapes {
    public int x = 12;
    public int y = 24;
    public void area()
    {
        System.out.println("This is the area of the Shape");
    }
    public void nice()
    {
        System.out.println("This is really nice");
    }
}

class Square extends Shapes
{
    public int z = 45;
    @Override
    public void area()
    {
        System.out.println("Area of square");
    }
    @Override
    public void nice()
    {
        System.out.println("Nice Bro");
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Shapes s1 = new Shapes();
        Square sq = new Square();
        Shapes s2 = new Square();
        // Hello h1 = new Hello();
        s1.area();
        sq.area();
        s2.nice();
    }
}