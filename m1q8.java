//8. Program to input 5 numbers from keyboard and find their sum and average.   
import java.util.Scanner;
public class m1q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        double sum = 0;
        double average;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }
        average = sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();
    }
}
