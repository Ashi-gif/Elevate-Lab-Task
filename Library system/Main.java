import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample Data
        library.addBook(new Book(1, "Java Basics"));
        library.addBook(new Book(2, "OOP Concepts"));
        library.addBook(new Book(3, "Data Structures"));

        library.addUser(new Users(101, "Alice"));
        library.addUser(new Users(102, "Bob"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Display Books");
            System.out.println("2. Display Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    library.issueBook(bookId, userId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
