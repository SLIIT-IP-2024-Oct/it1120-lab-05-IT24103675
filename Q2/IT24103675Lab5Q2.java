import java.util.Scanner;

public class IT24103675Lab5Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of new members
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate the input
        if (newMembers < 0) {
            System.out.println("Invalid input;The input must be 0 or greater");
            return; // Exit the program
        }

        // Determine the prize using a switch statement
        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone"; // For 5 or more new members
        }

        // Display the prize
        System.out.println("The prize you are entitled to: " + prize);
    }
}
