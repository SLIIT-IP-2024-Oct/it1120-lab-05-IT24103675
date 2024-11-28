import java.util.Scanner;

public class IT24103675Lab5Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the First integer:");
        int num1 = scanner.nextInt();
		 System.out.print("Enter the Second integer:");
        int num2 = scanner.nextInt();
		 System.out.print("Enter the Third integer:");
        int num3 = scanner.nextInt();

        int smallest, largest;

        // Determine the smallest number
        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        // Determine the largest number
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }
		System.out.println("User Entered Numbers are:"+ num1 +" "+num2+" "+num3);

        // Display the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}
