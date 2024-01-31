//8. Program that reverses an array and stores it in the same array.   
public class m3q8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Original Array: ");
        printArray(array);

        reverseArrayInPlace(array);

        System.out.print("Reversed Array: ");
        printArray(array);
    }

    // Function to reverse an array in-place
    private static void reverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Function to print the contents of an array
    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
