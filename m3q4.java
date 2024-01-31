//4. Program to read and print an array of size N rows with variable column size .(Hint: Irregular array).
import java.util.Scanner;

public class m3q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Declare the irregular array
        int[][] irregularArray = new int[numRows][];

        // Input elements for each row with variable column size
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int numColumns = scanner.nextInt();

            // Initialize the array for the current row
            irregularArray[i] = new int[numColumns];

            // Input elements for the current row
            System.out.print("Enter " + numColumns + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < numColumns; j++) {
                irregularArray[i][j] = scanner.nextInt();
            }
        }

        // Print the irregular array
        System.out.println("\nIrregular Array:");

        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                System.out.print(irregularArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
