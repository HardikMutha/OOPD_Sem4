public class Main implements A,B {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.sayNice();
        A.sayHello();
        B.sayHello();
        obj.sayNo();
    }
}
