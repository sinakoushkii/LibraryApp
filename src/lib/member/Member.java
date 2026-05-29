package lib.member;

import lib.book.Book;
import java.util.ArrayList;

/**
 * This class stores information about a member, including name, phone number and the borrow books
 */
public class Member {
    private int id;
    private String name;
    private String phoneNumber;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    /**
     * Constructs a new member object .
     *
     * @param id The id of the member
     * @param name name of the member.
     * @param phoneNumber phoneNumber of the member.
     */
    public Member(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Display the borrowed books of a member
     */
    public void displayBorrowedBooks(){
        if (this.borrowedBooks.isEmpty()) {
            System.out.println(this.name+" has not borrowed any books");
            return;
        }
        System.out.println(this.name + " borrowed books :");
        for (Book book : this.borrowedBooks) {
            System.out.println(book.getTitle()+ " is written by "+book.getAuthor());
        }
    }

    /**
     * Return a book to the library
     *
     * @param book the book the member returns
     */
    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    /**
     * Borrow a book from library
     *
     * @param book the book the member borrows
     */
    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    /**
     * Get the id of member
     * @return the id of member
     */
    public int  getId() {
        return this.id;
    }

    /**
     * Returns a string representation of the Member object.
     * This includes the member's ID, name, and number of borrowed books.
     *
     * @return A string representation of the Book.
     */
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowedCount=" + borrowedBooks.size() +
                '}';
    }
}
