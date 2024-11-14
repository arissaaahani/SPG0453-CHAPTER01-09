package bmi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height in m: ");
            double height = scanner.nextDouble();

            if (height <= 0) {
                throw new ArithmeticException("Height must be greater than 0.");
            }

            double bmi = weight / (height * height);
            System.out.println("\nYour Body Mass Index (BMI) is: " + bmi);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
