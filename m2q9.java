//9. How to pass the variable length arguments in java, illustrate with an example program. 
public class m2q9 {

    // Method using varargs to calculate the sum of integers
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example 1: Passing multiple integers
        int sum1 = calculateSum(1, 2, 3, 4, 5);
        System.out.println("Sum 1: " + sum1); // Output: Sum 1: 15

        // Example 2: Passing an array
        int[] array = {10, 20, 30, 40, 50};
        int sum2 = calculateSum(array);
        System.out.println("Sum 2: " + sum2); // Output: Sum 2: 150

        // Example 3: Passing no arguments
        int sum3 = calculateSum();
        System.out.println("Sum 3: " + sum3); // Output: Sum 3: 0
    }
}
