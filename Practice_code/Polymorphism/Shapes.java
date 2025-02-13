public class Shapes {
    public void area()
    {
        System.out.println("Area from Shapes Class");
    }
}

class Square extends Shapes
{
    public int x = 12;
    @Override
    public void area()
    {
        System.out.println("Area from Square class");
    }
}

class Circle extends Shapes
{
    @Override
    public void area()
    {
        System.out.println("Area from Circle Class");
    }
}