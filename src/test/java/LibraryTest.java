import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void setUp(){
        book1 = new Book("Ruby Coding","Chris Dryden","Education");
        book2 = new Book("Salmon Cooking","Malcolm Holwill","Comedy");
        book3 = new Book("Python for Dummies","Zsolt PS","Education");
        book4 = new Book("Harry Potter","JK Rowling","Fiction");
        library = new Library(3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void countBooksInCollection(){
        assertEquals(3,library.countCollection());
    }

    @Test
    public void checkStockBeforeAddingBook(){
        library.addBook(book4);
        assertEquals(3,library.countCollection());
    }

//    @Test
//    public void getBooksByGenre(){
//        library.countGenre();
//        assertEquals(2,library.countGenre());
//    }
}
