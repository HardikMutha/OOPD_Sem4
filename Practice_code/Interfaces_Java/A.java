// package Practice_code.Interfaces_Java;

public interface A {
    static void sayHello()
    {
        System.out.println("Hello From interface A");
    }
    default void sayNice()
    {
        System.out.println("Default from inteface A");
    }
    
}
