package marks;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter the marks for Test 1 (/100): ");
        double test1Marks = scanner.nextDouble();

        System.out.print("Enter the marks for Test 2 (/100): ");
        double test2Marks = scanner.nextDouble();

        double averageMark = (test1Marks + test2Marks) / 2;

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + averageMark);

        scanner.close();
    }
}
