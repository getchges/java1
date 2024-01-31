//9. Program in Java to display the multiplication table of a given integer.
import java.util.Scanner;
public class m1q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to display its multiplication table: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
