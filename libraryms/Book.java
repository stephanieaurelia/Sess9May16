package sess9may16_gslc;

// Book class = an abstract class that extends the LibraryItem interface
// Provides a common structure and behavior for all types of books in the library.

public abstract class Book implements LibraryItem {
	// Includes properties like title and author and can have additional methods if needed.
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
