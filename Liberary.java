import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private boolean checkedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnBook() {
        checkedOut = false;
    }
}

 class LibraryUser {
    private String username;
    private String password;

    public LibraryUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}

public class Liberary {
    public static class LibraryList {
        private List<Book> availableBooks;
        private List<Book> checkedOutBooks;
        private List<LibraryUser> users;

        public LibraryList() {
            availableBooks = new ArrayList<>();
            checkedOutBooks = new ArrayList<>();
            users = new ArrayList<>();
        }

        public void addBook(Book book) {
            availableBooks.add(book);
        }

        public void addUser(LibraryUser user) {
            users.add(user);
        }

        public void checkoutBook(Book book, LibraryUser user) {
            if (availableBooks.contains(book) && !book.isCheckedOut() && users.contains(user)) {
                book.checkOut();
                availableBooks.remove(book);
                checkedOutBooks.add(book);
                System.out.println(user.getUsername() + " has checked out the book: " + book.getTitle());
            } else {
                System.out.println("Book not available for checkout or invalid user.");
            }
        }

        public void returnBook(Book book, LibraryUser user) {
            if (checkedOutBooks.contains(book) && users.contains(user)) {
                book.returnBook();
                checkedOutBooks.remove(book);
                availableBooks.add(book);
                System.out.println(user.getUsername() + " has returned the book: " + book.getTitle());
            } else {
                System.out.println("Book cannot be returned or invalid user.");
            }
        }
        
        
        
    }

    public static void main(String[] args) {
        Book book1 = new Book("Shut Up", "You Too");
        Book book2 = new Book("Shut Up Part 2", "You Too the Junior");

        LibraryUser user1 = new LibraryUser("Arpit", "Arpit123");

        LibraryList libraryList = new LibraryList();

        libraryList.addBook(book1);
        libraryList.addBook(book2);
        libraryList.addUser(user1);

        libraryList.checkoutBook(book1, user1);
        libraryList.checkoutBook(book2, user1);
        libraryList.returnBook(book2, user1);
        libraryList.returnBook(book1, user1);
    }
}
