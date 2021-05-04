import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> booksBorrowed;

    public Borrower(String name){
        this.name = name;
        this.booksBorrowed = new ArrayList<Book>();
    }

    public Object countCollection() {
        return this.booksBorrowed.size();
    }

    public void borrowBook(Book book) {
        this.booksBorrowed.add(book);
    }
}
