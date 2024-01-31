//10. Convert a given integer array of Size “N” into string.  
public class m3q10 {
    public static void main(String[] args) {
        // Given integer array
        int[] intArray = {1, 2, 3, 4, 5};

        // Convert the integer array to a string
        String resultString = arrayToString(intArray);

        // Print the result
        System.out.println("Integer Array: " + arrayToString(intArray));
    }

    // Function to convert an integer array to a string
    private static String arrayToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            // Append each element to the StringBuilder
            stringBuilder.append(arr[i]);

            // Add a comma if it's not the last element
            if (i < arr.length - 1) {
                stringBuilder.append(", ");
            }
        }

        // Convert StringBuilder to a string
        return stringBuilder.toString();
    }
}
