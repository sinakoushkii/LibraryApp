import lib.Library;
import lib.book.Book;
import lib.member.Member;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library(1001,"The Central Library of Tehran");
        Member student1=new Member(2001,"Sina koushki","0937");
        Member student2=new Member(2002,"Reza naseri","0930");
        Book book1=new Book(3001,"atomic habits","someone");
        Book book2=new Book(3002,"good vibes","vex king");
        Book book3=new Book(3003,"5am club","a person");
        Book book4=new Book(3004,"rich dad, poor dad","a teacher");


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

//        library.displayAllBooks();

        library.borrowBook(book1,student1);
        library.displayBorrowedBooks();
        System.out.println("------------------------");
        student1.displayBorrowedBooks();
        System.out.println("------------------------");
        library.displayAllBooks();
        library.returnBook(book1,student1);
        System.out.println("------------------------");
        student1.displayBorrowedBooks();
        System.out.println("------------------------");
        library.displayAllBooks();


    }
}