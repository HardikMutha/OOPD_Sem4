public class Child extends Parent implements Car{
    @Override
    void career(String name) {
        System.out.println("This is my carrer choice nigga");
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.career("Nice");
        String a1[] = {"Hello","Nice"};
        Car.main(a1);
    }
}
