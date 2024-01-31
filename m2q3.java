//3. Design a class to overload a method compare() to return the greater of two as follows:   
//void compare(int, int)  
//void compare(char, char)   
//void compare(String, String)  
public class m2q3 {

    // Overloaded method to compare and return the greater of two integers
    public void compare(int num1, int num2) {
        System.out.println("Comparing integers:");
        if (num1 > num2) {
            System.out.println("The greater of the two numbers is: " + num1);
        } else {
            System.out.println("The greater of the two numbers is: " + num2);
        }
    }

    // Overloaded method to compare and return the greater of two characters
    public void compare(char char1, char char2) {
        System.out.println("Comparing characters:");
        if (char1 > char2) {
            System.out.println("The greater of the two characters is: " + char1);
        } else {
            System.out.println("The greater of the two characters is: " + char2);
        }
    }

    // Overloaded method to compare and return the greater of two strings
    public void compare(String str1, String str2) {
        System.out.println("Comparing strings:");
        if (str1.compareTo(str2) > 0) {
            System.out.println("The greater of the two strings is: " + str1);
        } else {
            System.out.println("The greater of the two strings is: " + str2);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Comparer class
        m2q3 comparer = new m2q3();

        // Example usage: compare two integers
        comparer.compare(10, 20);

        // Example usage: compare two characters
        comparer.compare('A', 'B');

        // Example usage: compare two strings
        comparer.compare("apple", "orange");
    }
}
