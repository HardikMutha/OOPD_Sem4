import java.util.*;
// Base class for all library items

class LibraryItem {}

class Book extends LibraryItem {
    String title;
    Book(String title) { this.title = title; }
    public String toString() { return "Book: " + title; }
}

class Journal extends LibraryItem {
    String name;
    Journal(String name) { this.name = name; }
    public String toString() { return "Journal: " + name; }
}

class Magazine extends LibraryItem {
    String edition;
    Magazine(String edition) { this.edition = edition; }
    public String toString() { return "Magazine: " + edition; }
}

// Generic class restricted to LibraryItem and its subclasses
class Library<T extends LibraryItem> {
    private List<T> items = new ArrayList<>();
    
    public void addItem(T item) {
        items.add(item);
    }
    
    public List<T> getItems() {
        return items;
    }
}

public class Main {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addItem(new Book("The Catcher in the Rye"));
        bookLibrary.addItem(new Book("To Kill a Mockingbird"));
        
        Library<Journal> journalLibrary = new Library<>();
        journalLibrary.addItem(new Journal("Science Journal"));
        
        Library<Magazine> magazineLibrary = new Library<>();
        magazineLibrary.addItem(new Magazine("Time - March Edition"));
        
        System.out.println("Books: " + bookLibrary.getItems());
        System.out.println("Journals: " + journalLibrary.getItems());
        System.out.println("Magazines: " + magazineLibrary.getItems());
    }
}
