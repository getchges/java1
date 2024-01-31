//7. Illustrate the usage of ‘this’, ‘final’ and ‘finalize’ using a java program.  
public class m2q7 {

    // Example variable
    public final int finalVariable; // final variable

    // Constructor
    public m2q7(int initialValue) {
        this.finalVariable = initialValue; // 'this' is used to refer to the instance variable
    }

    // Method using 'this' keyword
    public void printFinalVariable() {
        System.out.println("Value of finalVariable using 'this': " + this.finalVariable);
    }

    // Finalize method (deprecated, not recommended for general use)
    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup operations here
            System.out.println("Finalize method called. Cleaning up resources.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Create an instance of ExampleClass
        m2q7 exampleObject = new m2q7(42);

        // Use 'this' to access instance variable
        exampleObject.printFinalVariable();

        // Demonstrate final variable (cannot be reassigned)
        // Uncommenting the line below would result in a compilation error
        // exampleObject.finalVariable = 50;

        // Call garbage collection to invoke finalize method (not recommended for general use)
        System.gc();
    }
}
