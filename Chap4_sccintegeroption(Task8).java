package sequence;

import java.util.Scanner;

public class sccintegeroption {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final double Base = 600.0;
        final double Commission = 0.05;
        int option;

        do {
            System.out.print("Enter the total gross sales for the previous week (in RM): ");
            double gross = read.nextDouble();

            double commission = gross * Commission;
            double total = Base + commission;

            System.out.println("\nSales Commission: RM " + String.format("%.2f", commission));
            System.out.println("Total Earnings for the week: RM " + String.format("%.2f", total));

            System.out.print("Enter 1 to calculate again or 0 to exit: ");
            option = read.nextInt();
            
        } while (option == 1);

        System.out.println("Program exited.");
    }
}
