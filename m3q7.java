//7. Program to delete duplicate elements from an array of size 5.
import java.util.Arrays;

public class m3q7 {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 3, 2};

        System.out.print("Original Array: ");
        printArray(array);

        // Remove duplicates using Java Streams and distinct()
        int[] newArray = Arrays.stream(array).distinct().toArray();

        System.out.print("Array after Removing Duplicates: ");
        printArray(newArray);
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
