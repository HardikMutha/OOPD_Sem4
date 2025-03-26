public class Main {
    public static void main(String[] args) 
    {
        Stocks ListOfAllStocks = new Stocks();
        User u1 = new User("Hardik");
        User u2 = new User("Rohit");
        User u3 = new User("Ashwin");
        User u4 = new User("John");
        User u5 = new User("Mike");
        Stock s1 = ListOfAllStocks.getAllStocks().get(3);
        Stock s2 = ListOfAllStocks.getAllStocks().get(2);
        s2.addSubscriber(u1);
        
        s1.addSubscriber(u2);
        s1.addSubscriber(u4);
        s1.addSubscriber(u5);
        
        s1.setCurrentPrice(s1.getCurrentPrice()+40.0);

        s2.setCurrentPrice(s2.getCurrentPrice()+60.0);
    }
}