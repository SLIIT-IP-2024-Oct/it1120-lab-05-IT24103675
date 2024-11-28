import java.util.Scanner;

public class IT24103675Lab5Q3{
	public static void main(String[] args){
      double ROOM_RATE_PER_DAY = 48000.0;
      int DISCOUNT_10_DAYS = 3;
      int DISCOUNT_20_DAYS = 5;
      double DISCOUNT_10 = 0.1;
      double DISCOUNT_20 = 0.2;

        Scanner input = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter the start date: ");
        int start_Date = input.nextInt();
        System.out.print("Enter the end date: ");
        int end_Date = input.nextInt();

        // Validation 1: Start and end dates must be between 1 and 31
        if (start_Date < 1 || start_Date > 31 || end_Date < 1 || end_Date > 31) {
            System.out.print("Error: Start and end dates must be between 1 and 31.");
            return;
        }

        // Validation 2: Start date should be less than the end date
        if (start_Date >= end_Date) {
            System.out.print("Error: Start date must be less than the end date.");
            return;
        }

        // Calculate the number of days reserved
        int days_Booked = end_Date - start_Date;

        // Determine the discount rate
        double discount_Rate = 0.0;
        if (days_Booked >= DISCOUNT_20_DAYS) {
            discount_Rate = DISCOUNT_20;
        } else if (days_Booked >= DISCOUNT_10_DAYS) {
            discount_Rate = DISCOUNT_10;
        }

        // Calculate the total amount
        double total_Amount = days_Booked * ROOM_RATE_PER_DAY;
        double discount = total_Amount * discount_Rate;
        double final_Amount = total_Amount - discount;

        // Display the results
        System.out.println("Number of days reserved: " + days_Booked);
        System.out.println("Total amount before discount: Rs."+ total_Amount);
        System.out.println("Discount applied: Rs."+discount);
        System.out.println("Final amount to be paid: Rs."+final_Amount);
    }
}
