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

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Book already exists");
                return;
            }
        }
        books.add(book);
    }


    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed");
        } else {
            System.out.println("Book not found");
        }
    }


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

    public void displayABook(int id){
        for(Book book:books){
            if(book.getId() == id){
                System.out.println(book.getTitle() + " is written by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found !");
    }
    public void displayAllBooks() {
        System.out.println("Library All Books:");
        for (Book book: books) {
            System.out.println(book.getTitle() + " is written by " + book.getAuthor());
        }
    }

    public void displayBorrowedBooks(){
        System.out.println("Library Borrowed Books:");

        for(Book book:borrowedBooks){
            System.out.println(book.getTitle());
        }
    }

}
