//10. Write a java program to overload the constructors.  
public class m2q10 {
    public int value1;
    public int value2;
    public String message;

    // Default constructor
    public m2q10() {
        value1 = 0;
        value2 = 0;
        message = "Default Message";
    }

    // Constructor with two parameters
    public m2q10(int v1, int v2) {
        value1 = v1;
        value2 = v2;
        message = "Custom Message";
    }

    // Constructor with three parameters
    public m2q10(int v1, int v2, String msg) {
        value1 = v1;
        value2 = v2;
        message = msg;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        m2q10 obj1 = new m2q10();
        m2q10 obj2 = new m2q10(10, 20);
        m2q10 obj3 = new m2q10(5, 15, "Custom Message");

        // Displaying values of objects
        System.out.println("Object 1:");
        obj1.displayValues();
        
        System.out.println("\nObject 2:");
        obj2.displayValues();
        
        System.out.println("\nObject 3:");
        obj3.displayValues();
    }
}
