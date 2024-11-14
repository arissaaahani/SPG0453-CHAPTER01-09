package sequence;

import java.util.Scanner;

public class countevennodd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String choice;

        do {
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter a sequence of integers (separated by spaces): ");
            String input = read.nextLine();
            String[] numbers = input.split(" ");

            for (String number : numbers) {
                try {
                    int num = Integer.parseInt(number);
                    if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("'" + number + "' is not a valid integer. Ignoring...");
                }
            }

            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            System.out.print("Do you want to enter another sequence? (yes/no): ");
            choice = read.nextLine().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Program exited.");
    }
}
