 import java.util.*;
public class Library {


    private List<Book> books = new ArrayList<>();
    private List<Users> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(Users user) {
        users.add(user);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        for (Users user : users) {
            System.out.println(user);
        }
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        if (book != null && !book.isIssued()) {
            book.issue();
            System.out.println("Book '" + book.getTitle() + "' issued to User ID: " + userId);
        } else {
            System.out.println("Book not found or already issued.");
        }
    }

    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book '" + book.getTitle() + "' returned successfully.");
        } else {
            System.out.println("Book not found or not issued.");
        }
    }

    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }
}

    

