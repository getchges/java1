//5. Program to implement a Book class that stores the details of a book such as its code, title and price (Use constructors 
//to  initialize the objects).
import java.util.Scanner;

public class m2q5 {
    public int bookCode;
    public String title;
    public double price; 

    // Constructor to initialize the book details
    public m2q5(int code, String bookTitle, double bookPrice) {
        bookCode = code;
        title = bookTitle;
        price = bookPrice;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Code: " + bookCode);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get book details from user input
        System.out.print("Enter Book Code: ");
        int code = scanner.nextInt();

        System.out.print("Enter Title: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String title = scanner.nextLine();

        System.out.print("Enter Price: $");
        double price = scanner.nextDouble();

        // Create an instance of the Book class using the constructor
        m2q5 myBook = new m2q5(code, title, price);

        // Display book details
        System.out.println("\nBook Details:");
        myBook.displayBookDetails();
    }
}
