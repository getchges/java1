//6. Program to find an element from a sorted array using binary search (java.util.package)  
import java.util.Arrays;
import java.util.Scanner;

public class m3q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sorted array
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the sorted array
        System.out.print("Sorted Array: ");
        printArray(sortedArray);

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        // Perform binary search
        int index = Arrays.binarySearch(sortedArray, searchElement);

        // Check if the element is found
        if (index >= 0) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }

        scanner.close();
    }

    // Function to print the contents of an array
    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
