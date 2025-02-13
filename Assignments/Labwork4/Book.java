
import java.time.LocalDate;

public class Book {
    
    private String BookName;
    private String author;
    private long BookId;
    private boolean isAvailable;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Book(String BookName,String author,long BookId)
    {
        this.BookName = BookName;
        this.author = author;
        this.BookId = BookId;
        this.issueDate = null;
        this.returnDate = null;
        this.isAvailable = true;
    }

    public String getBookName() {
        return this.BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getBookId() {
        return this.BookId;
    }

    public void setBookId(long BookId) {
        this.BookId = BookId;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void toggleIsAvailable()
    {
        this.isAvailable = !this.isAvailable;
    }

    public LocalDate getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}

class Mystery extends Book
{
    private String genre = "Mystery";
    public Mystery(String Bookname,String author,long BookId) {
        super(Bookname, author, BookId);
    }
    public String getGenre()
    {
        return this.genre;
    }
}


class Novel extends Book
{
    private String genre = "Novel";
    public Novel(String Bookname,String author,long BookId) {
        super(Bookname, author, BookId);
    }
    public String getGenre()
    {
        return this.genre;
    }
    
}

class Thriller extends Book
{
    private String genre = "Thriller";
    public Thriller(String Bookname,String author,long BookId) {
        super(Bookname, author, BookId);
    }
    public String getGenre()
    {
        return this.genre;
    }
}
