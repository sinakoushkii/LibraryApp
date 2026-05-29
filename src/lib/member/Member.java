package lib.member;

import lib.book.Book;
import java.util.ArrayList;

public class Member {
    private int id;
    private String name;
    private String phoneNumber;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();


    public Member(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

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

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public int  getId() {
        return this.id;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowedCount=" + borrowedBooks.size() +
                '}';
    }
}
