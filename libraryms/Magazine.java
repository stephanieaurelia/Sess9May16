package sess9may16_gslc;

// The Magazine class extend the Book abstract class and representing magazine. 
// Provide its own implementations of the checkOut() method.
public class Magazine implements LibraryItem {
    private String title;
    private String publisher;

    public Magazine(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public void checkOut(String borrower) {
        System.out.println("Magazine checked out: " + title + " by " + publisher + "\nBorrower: " + borrower);
    }
}
