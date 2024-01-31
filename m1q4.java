//4. Program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the  weekday.
import java.util.Scanner;
public class m1q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int userNumber = scanner.nextInt();
        if (userNumber >= 1 && userNumber <= 7) {
            String weekdayName = getWeekdayName(userNumber);
            System.out.println("The corresponding weekday is: " + weekdayName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        scanner.close();
    }
    public static String getWeekdayName(int number) {
        switch (number) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid";
        }
    }
}
