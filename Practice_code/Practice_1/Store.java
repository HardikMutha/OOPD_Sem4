import java.util.ArrayList;

public class Store {
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Book> books;
    Store()
    {
        this.books = new ArrayList<>();
    }
    Book getBook(int index)
    {
        return (new Book(this.books.get(index)));
    }
    void setBook(int index,Book myBook)
    {
        Book tempBook = new Book(myBook);
        this.books.set(index, tempBook);
    }
    void addBook(Book myBook)
    {
        this.books.add(new Book(myBook));
    }

    boolean contains(Book myBook)
    {
        return this.books.contains(myBook);
    }

    void sellBook(String title)
    {
        for(int i=0;i<this.books.size();i++)
        {
            if(this.books.get(i).getTitle().equals(title))
                this.books.remove(i);
        }
    }

}
