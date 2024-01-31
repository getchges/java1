//9. Program to implement all String methods on a Input String.   
import java.util.Scanner;

public class m3q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display the original string
        System.out.println("Original String: " + inputString);

        // String methods
        int length = inputString.length();
        System.out.println("1. Length of the string: " + length);

        String upperCase = inputString.toUpperCase();
        System.out.println("2. Uppercase: " + upperCase);

        String lowerCase = inputString.toLowerCase();
        System.out.println("3. Lowercase: " + lowerCase);

        char firstChar = inputString.charAt(0);
        System.out.println("4. First character: " + firstChar);

        char lastChar = inputString.charAt(length - 1);
        System.out.println("5. Last character: " + lastChar);

        boolean startsWithHello = inputString.startsWith("Hello");
        System.out.println("6. Starts with 'Hello': " + startsWithHello);

        boolean endsWithWorld = inputString.endsWith("World");
        System.out.println("7. Ends with 'World': " + endsWithWorld);

        String substring = inputString.substring(3, 8);
        System.out.println("8. Substring from index 3 to 7: " + substring);

        int indexOfSpace = inputString.indexOf(' ');
        System.out.println("9. Index of first space: " + indexOfSpace);

        int lastIndexOfSpace = inputString.lastIndexOf(' ');
        System.out.println("10. Last index of space: " + lastIndexOfSpace);

        boolean containsJava = inputString.contains("Java");
        System.out.println("11. Contains 'Java': " + containsJava);

        String replacedString = inputString.replace("Java", "Programming");
        System.out.println("12. Replace 'Java' with 'Programming': " + replacedString);

        // Closing the scanner
        scanner.close();
    }
}
