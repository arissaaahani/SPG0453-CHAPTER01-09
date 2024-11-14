package sequence;

import java.util.Scanner;

public class salecommissioncalc {
    public static void main(String[] args) {
        
        final double Base = 600.0;
        final double Commission = 0.05;
        
        Scanner read = new Scanner(System.in);

        System.out.print("Enter total gross sales for the previous week (in RM): ");
        double gross = read.nextDouble();

        double commission = gross * Commission;
        double total = Base + commission;

        System.out.println("\nSales Commission: RM " + String.format("%.2f", commission));
        System.out.println("Total Earnings for the week: RM " + String.format("%.2f", total));

    }
}
