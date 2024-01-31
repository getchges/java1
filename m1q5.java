//5. Program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.Scanner;

public class m1q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double number2 = scanner.nextDouble();
        if (areEqualUpToThreeDecimalPlaces(number1, number2)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
        scanner.close();
    }
    public static boolean areEqualUpToThreeDecimalPlaces(double num1, double num2) {
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);
        return scaledNum1 == scaledNum2;
    }
}
