//2. Program that performs arithmetic operations with values of type char.
import java.util.Scanner;

public class m2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character for operand 1: ");
        char operand1 = scanner.next().charAt(0);

        System.out.print("Enter a character for operand 2: ");
        char operand2 = scanner.next().charAt(0);

        System.out.println("Arithmetic operations with characters:");
        System.out.println("Operand 1: " + operand1);
        System.out.println("Operand 2: " + operand2);

        // Addition
        char additionResult = (char) (operand1 + operand2);
        System.out.println("Addition result: " + additionResult);

        // Subtraction
        char subtractionResult = (char) (operand1 - operand2);
        System.out.println("Subtraction result: " + subtractionResult);

        // Multiplication
        char multiplicationResult = (char) (operand1 * operand2);
        System.out.println("Multiplication result: " + multiplicationResult);

        // Division
        if (operand2 != 0) {
            char divisionResult = (char) (operand1 / operand2);
            System.out.println("Division result: " + divisionResult);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Modulus
        if (operand2 != 0) {
            char modulusResult = (char) (operand1 % operand2);
            System.out.println("Modulus result: " + modulusResult);
        } else {
            System.out.println("Cannot calculate modulus when divisor is zero.");
        }
    }
}
