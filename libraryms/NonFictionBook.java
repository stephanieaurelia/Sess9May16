package sess9may16_gslc;

// The NonFictionBook class extend the Book abstract class and representing Non-fiction books. 
// Provide its own implementations of the checkOut() method.
public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }

    public void checkOut(String borrower) {
        System.out.println("Non-fiction book checked out: " + title + " by " + author + "\nBorrower: " + borrower);
    }
}
