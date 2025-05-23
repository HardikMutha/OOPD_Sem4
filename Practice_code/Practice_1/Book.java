import java.util.Objects;

public class Book {
    // private static int nigga = 12;
    private String title;
    private String author;
    private double rating;
    private double price;
    
    Book(String title,String author,double rating,double price)
    {
        this.title =  title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }
    // Important doubt resolved;
    // When private variables are accessed within the same class there is no requirement to access them using getters and setters.
    // Since private allows direct access within the same class.
    
    Book(String author,double rating,double price,String title)
    {
      this.author = author;
      this.rating = rating;
      this.price = price;
      this.title = title; 
    }
    Book(Book newBook)
    {
        this.title = newBook.title;   // getters need not be used to access the title
        this.author = newBook.author;
        this.price = newBook.price;
        this.rating = newBook.rating;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && rating == book.rating && price == book.price;
    }

}
