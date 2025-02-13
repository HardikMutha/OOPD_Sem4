
import java.time.LocalDate;

public class Customer {
    private String CustomerName;
    private long CustomerId;
    private long borrowedBook;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private double fineAccumulated;

    public Customer(String CustomerName,long CustomerId)
    {
        this.CustomerName = CustomerName;
        this.CustomerId = CustomerId;
        this.borrowedBook = 0;
        this.borrowDate = null;
        this.returnDate = null;
        this.fineAccumulated = 0.0;
    }

    public String getCustomerName() {
        return this.CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public long getCustomerId() {
        return this.CustomerId;
    }

    public void setCustomerId(long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public long getBorrowedBook() {
        return this.borrowedBook;
    }

    public void setBorrowedBook(long borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public LocalDate getBorrowDate() {
        return this.borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double getFineAccumulated() {
        return this.fineAccumulated;
    }

    public void setFineAccumulated(double fineAccumulated) {
        this.fineAccumulated = fineAccumulated;
    }

}
