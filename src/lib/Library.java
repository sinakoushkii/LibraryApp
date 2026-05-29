package lib;

import lib.book.Book;
import lib.member.Member;

import java.util.ArrayList;

/**
 * This class stores represent a library, including books
 * CRUD logic is implemented
 */

public class Library {

    private final int id;
    private String name;
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    /**
     * Constructs a new library object .
     *
     * @param id The id of the library
     * @param name The title of the name.
     */
    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Library borrow a book
     * Also the borrowed book is registred in the member borrowed list
     * @param book The book that someone wants to borrow
     * @param member A person how wants to borrow a book
     */
    public void borrowBook(Book book, Member member) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                // add book to the borrowed list of library and member
                member.borrowBook(book);
                borrowedBooks.add(book);
                // remove the book from available book list
                books.remove(book);
                return;
            }
        }
        System.out.println("Book not found");
    }


    /**
     * Library take back a book
     * Also the book is remove from member borrowed list
     * @param book The book that someone wants to return
     * @param member A person how wants to return a book
     */
    public void returnBook(Book book, Member member) {
        for (Book b : borrowedBooks) {
            if (b.getId() == book.getId()) {
                member.returnBook(book);
                borrowedBooks.remove(book);
                books.add(book);
                return;
            }
        }
    }

    /**
     * Add new book to the library
     *
     * @param book A book that will be added to the library
     */
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Book already exists");
                return;
            }
        }
        books.add(book);
    }

    /**
     * Remove a book from the library
     *
     * @param book A book that will be removed from the library
     */
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed");
        } else {
            System.out.println("Book not found");
        }
    }


    /**
     * Update a book title
     *
     * @param id id of a book that its title should be changed
     * @param newName the new name of the book
     */
    public void updateBook(int id, String newName) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(newName);
                System.out.println("Book updated");
                return;
            }
        }
        System.out.println("Book not found !");
    }

    /**
     * Displays detail of the selected book
     *
     * @param id Book id is used to show the book detail
     */
    public void displayABook(int id){
        for(Book book:books){
            if(book.getId() == id){
                System.out.println(book.getTitle() + " is written by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found !");
    }

    /**
     * Displays detail of All the books
     *
     */
    public void displayAllBooks() {
        System.out.println("Library All Books:");
        for (Book book: books) {
            System.out.println(book.getTitle() + " is written by " + book.getAuthor());
        }
    }

    /**
     * Displays detail of All the borrowed books
     *
     */
    public void displayBorrowedBooks(){
        System.out.println("Library Borrowed Books:");

        for(Book book:borrowedBooks){
            System.out.println(book.getTitle());
        }
    }

}
