package sequence;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to display the Fibonacci series up to: ");
        int maxNumber = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci series up to " + maxNumber + ":");
        
        while (num1 <= maxNumber) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}

