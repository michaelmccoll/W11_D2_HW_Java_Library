import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private Integer capacity;
    private ArrayList<Book> collection;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int countCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.collection.size() < this.capacity){
        this.collection.add(book);}
    }
}
