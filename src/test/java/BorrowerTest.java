import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Library library;

    @Before
    public void setUp(){
        borrower = new Borrower("Tim");
        book4 = new Book("Harry Potter","JK Rowling","Fiction");
        library = new Library(4);
    }

    @Test
    public void booksBorrowedInCollection(){
        borrower.borrowBook(book4);
        assertEquals(1,borrower.countCollection());
    }
}
