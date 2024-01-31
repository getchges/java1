//5. Program that copies contents of one array to another using length member. 
import java.util.Arrays;

public class m3q5 {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Copy the contents of the source array to a new array
        int[] destinationArray = Arrays.copyOf(sourceArray, sourceArray.length);

        // Print the original and copied arrays
        System.out.print("Source Array: ");
        printArray(sourceArray);

        System.out.print("Copied Array: ");
        printArray(destinationArray);
    }

    // Function to print the contents of an array
    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
