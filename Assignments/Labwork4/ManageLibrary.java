public class ManageLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        Customer c1 = new Customer("John", 1);
        Customer c2 = new Customer("Doe", 2);
        Customer c3 = new Customer("Jane", 3);
        lib.addCustomer(c1);
        lib.addCustomer(c2);
        lib.addCustomer(c3);
        Mystery m1 = new Mystery("The Da Vinci Code", "Dan Brown", 1);
        Novel n1 = new Novel("Pride and Prejudice", "Jane Austen", 2);
        Thriller t1 = new Thriller("ElonMustDie", "Jeff Bezos", 3);
        
        Mystery m2 = new Mystery("The Lost Symbol", "Dan Brown", 8);
        Novel n2 = new Novel("Sense and Sensibility", "Jane Austen", 4);
        Thriller t2 = new Thriller("Ashneer", "Hardik", 5);
        
        lib.issueBook(1, 3);
        lib.returnBook(1, 3);

        double latefee = lib.getLateFee(1);
        System.out.println("Late Fee: " + latefee);
    }
}
