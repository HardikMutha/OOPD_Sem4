public interface B {
    default void sayNo()
    {
        System.out.println("Nice from interface B");
    }
    static void sayHello()
    {
        System.out.println("Hello from interface B");
    }
}
