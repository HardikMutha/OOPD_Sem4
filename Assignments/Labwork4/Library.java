
import java.time.LocalDate;
import java.util.ArrayList;

interface lateFeeCalc{
    public double getLateFeeForUser(LocalDate issueDate,LocalDate returnDate);
}

class LateFeeCalculator implements lateFeeCalc
{
    @Override
    public double getLateFeeForUser(LocalDate issueDate, LocalDate returnDate) {
        double latefee = 0;
        int startDay = issueDate.getDayOfYear();
        int endDay = returnDate.getDayOfYear();
        if((endDay-startDay)>=20)
        {
            latefee = (endDay-startDay)*30.0; //30 Rupees per day
        }
        return latefee;
    }
}


public class Library {
    private ArrayList<Book> AllBooks = new ArrayList<>();
    private ArrayList<Customer> AllCustomers = new ArrayList<>();
    
    public Library()
    {
        this.AllBooks = new ArrayList<>();
        this.AllBooks = new ArrayList<>();
    }

    public void addBook(Mystery book)
    {
        AllBooks.add(book);
    }
    public void addBook(Novel book)
    {
        AllBooks.add(book);
    }
    public void addBook(Thriller book)
    {
        AllBooks.add(book);
    }

    public void addCustomer(Customer customer)
    {
        AllCustomers.add(customer);
    }

    public void issueBook(long customerId,long BookId)
    {
        for(Customer x:AllCustomers)
        {
            if(x.getCustomerId()==customerId)
            {
                x.setBorrowedBook(BookId);
                x.setBorrowDate(LocalDate.now());
            }
        }
    }
    public void returnBook(long customerId,long BookId)
    {
        for(Customer x:AllCustomers)
        {
            if(x.getCustomerId()==customerId)
            {
                LocalDate returnDate = LocalDate.now().plusDays(50);
                x.setReturnDate(returnDate);
                x.setBorrowedBook(0);
            }
        }
    }

    public double getLateFee(long customerId)
    {
        for(Customer x:AllCustomers)
        {
            if(x.getCustomerId() == customerId)
            {
                LateFeeCalculator lf = new LateFeeCalculator();
                return lf.getLateFeeForUser(x.getBorrowDate(), x.getReturnDate());
            }
        }
        return 0.0;
    }
}
