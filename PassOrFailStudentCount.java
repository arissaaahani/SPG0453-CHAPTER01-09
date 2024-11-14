import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String continueProgram = "y";

        while (continueProgram.equalsIgnoreCase("y")) {
            System.out.print("Enter number of students: ");
            int numberOfStudents = read.nextInt();

            int passCount = 0;
            int failCount = 0;

            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.print("\nStudent " + i + " marks: ");
                double marks = read.nextDouble();
                char grade;

                if (marks >= 80) {
                    grade = 'A';
                    passCount++;
                } else if (marks >= 69) {
                    grade = 'B';
                    passCount++;
                } else if (marks >= 55) {
                    grade = 'C';
                    passCount++;
                } else if (marks >= 41) {
                    grade = 'D';
                    passCount++;
                } else {
                    grade = 'F';
                    failCount++;
                }

                System.out.printf("Grade for student %d = %c\n", i, grade);
                System.out.println("Status: " + (grade == 'F' ? "Fail" : "Pass"));
            }

            System.out.println("\nPass: " + passCount);
            System.out.println("Fail: " + failCount);
            System.out.println(passCount > failCount ? "Bonus to instructor" : "No bonus to instructor");

            System.out.print("Do you want to continue? (y/n): ");
            read.nextLine(); // Consume newline character
            continueProgram = read.nextLine();
        }

        JOptionPane.showMessageDialog(null, "Thank you for using the grading system!");
        read.close();
    }
}
