package sess9may16_gslc;

// The FictionBook class extend the Book abstract class and representing fiction vooks. 
// Provide its own implementations of the checkOut() method.
public class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }

    public void checkOut(String borrower) {
        System.out.println("Fiction book checked out: " + title + " by " + author + "\nBorrower: " + borrower);
    }
}
