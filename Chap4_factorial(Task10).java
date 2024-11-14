package sequence;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        long factorial = 1;

        // Iterative method to calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}

