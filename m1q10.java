// 10. Program in Java to display the pattern like right  angle triangle with a number.   
//Input number of rows: 5   
//Expected Output :   
//1   
//12   
//123   
//1234   
//12345 
import java.util.Scanner;
public class m1q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = scanner.nextInt();
        System.out.println("Expected Output:");
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}

