package lib.book;

/**
 * This class stores information about a book, including title and author
 */
public class Book {
    private final int id;
    private String title;
    private String author;

    /**
     * Constructs a new book object .
     *
     * @param id The id of the book
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * Get the title of the book
     * @return the title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title of the book
     * If the provided title is null, an error message will be printed to the console
     * @param title The new title of the book
     */
    public void setTitle(String title) {
        if(title != null) {
            this.title = title;
        }else{
            System.out.println("Title Cannot Be Null");
        }
    }

    /**
     * Get the author of the book
     * @return the author of the book
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Set the author of the book
     * If the provided author is null, an error message will be printed to the console
     * @param author The new author of the book
     */
    public void setAuthor(String author) {
        if(author != null) {
            this.author = author;
        }else{
            System.out.println("Author Cannot Be Null");
        }
    }

    public int getId() {
        return this.id;
    }

    /**
     * Returns a string representation of the Book object.
     * This includes the book's ID, title, and author.
     *
     * @return A string representation of the Book.
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
