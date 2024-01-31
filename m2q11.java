//11. Read the command line arguments and print the total number of arguments and its values. 
public class m2q11 {
    public static void main(String[] args) {
        // Display the total number of command line arguments
        System.out.println("Total number of command line arguments: " + args.length);

        // Display the values of each command line argument
        System.out.println("Command line arguments and their values:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
