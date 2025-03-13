public class Main {
    // User u1 = new User();
    public static void main(String[] args) {
        System.out.println("Main Thread Starts");
        User u1 = new User("hardik",1,10);
        User u2 = new User("Tanmay",4,5);
        User u3 = new User("Suswan",1,3);
        u1.start();
        u2.start();
        u3.start();
        System.out.println("Main Thread Ends");
    }
}