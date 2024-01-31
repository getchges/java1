//6. Differentiate between static and non-static methods in java. 
public class m2q6 {
    
    // Static variable
    static int staticVariable = 10;
    
    // Non-static variable
    int nonStaticVariable = 20;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        // You can only access static variables inside a static method
        System.out.println("Static variable: " + staticVariable);
        // You cannot access non-static variables directly inside a static method
        // Uncommenting the line below would result in a compilation error
        // System.out.println("Non-static variable: " + nonStaticVariable);
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
        // You can access both static and non-static variables inside a non-static method
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Non-static variable: " + nonStaticVariable);
    }

    public static void main(String[] args) {
        // Call static method directly using the class name
        staticMethod();

        // Create an instance of the class to call non-static method
        m2q6 obj = new m2q6();
        obj.nonStaticMethod();
        
        // Accessing static variable directly
        System.out.println("Accessing static variable outside methods: " + staticVariable);
        
        // Uncommenting the line below would result in a compilation error
        // System.out.println("Accessing non-static variable outside methods: " + nonStaticVariable);
    }
}
