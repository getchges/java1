//3. Program to find Maximum and minimum value in an array of size “M”, passed as argument. 
public class m3q3 {
    public static void main(String[] args) {
        // Check if array is provided as command line arguments
        if (args.length == 0) {
            System.out.println("Please provide an array of integers as command line arguments.");
            return;
        }

        // Convert command line arguments to an array of integers
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        // Find and print the maximum and minimum values
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // Function to find the maximum value in the array
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to find the minimum value in the array
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
