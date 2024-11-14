package grading.marks;

import javax.swing.JOptionPane; // Import JOptionPane for dialog boxes.
import java.util.Scanner; // Import Scanner class to read input.

public class GradingMarks {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // Create a Scanner object for user input.
        String continueProgram; // Variable to control whether the program continues or stops.

        // Start the loop to continue the program.
        do {
            // Prompt the user to enter the number of students.
            String studentInput = JOptionPane.showInputDialog(null, "Enter number of students:"); // Use JOptionPane to get the number of students
            if (studentInput == null) { // Handle case where dialog is closed
                System.out.println("Program terminated by user.");
                break; // Exit if dialog is closed
            }
            int student = Integer.parseInt(studentInput); // Read the number of students as an integer.

            int failCount = 0; // Initialize fail counter.
            int passCount = 0; // Initialize pass counter.

            // Loop through each student to get their marks.
            for (int i = 1; i <= student; i++) {
                double marks = getStudentMarks(read, i); // Get and validate student's marks.
                String grade = calculateGrade(marks); // Calculate the student's grade.
                boolean passed = isPassed(grade); // Check if the student passed based on the grade.

                // Output the student's grade and status (Pass/Fail).
                System.out.println("Grade for student " + i + " = " + grade);
                System.out.println("Status: " + (passed ? "Pass" : "Fail"));

                // Increment the pass or fail count.
                if (passed) {
                    passCount++;
                } else {
                    failCount++;
                }
            }

            // Display pass and fail counts and instructor's bonus status.
            displayResults(passCount, failCount);

            // Ask the user if they want to continue grading more students using a dialog box.
            continueProgram = JOptionPane.showInputDialog(null, "Do you want to continue? (y/n):");
            if (continueProgram == null) { // Handle case where dialog is closed
                System.out.println("Program terminated by user.");
                break; // Exit if dialog is closed
            }

        } while (continueProgram.equalsIgnoreCase("y")); // Continue if user enters "y".

        // Close the Scanner to prevent resource leaks.
        read.close();
        JOptionPane.showMessageDialog(null, "Thank you for using the grading system!"); // Final message box.
    }

    // Method to get and validate student's marks.
    public static double getStudentMarks(Scanner read, int studentNumber) {
        double marks = -1; // Initialize marks with an invalid value.
        
        // Loop until valid marks are entered.
        while (marks < 0) {
            System.out.print("Student " + studentNumber + " marks: "); // Prompt for student marks.
            // Check if the input is a valid number (double).
            while (!read.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for marks."); // Error message if input is invalid.
                read.next();  // Clear the invalid input.
            }
            marks = read.nextDouble(); // Read the valid marks as a double.
            
            // Validate marks are not negative.
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Please enter valid marks."); // Error message for negative marks.
            }
        }

        return marks; // Return the valid marks entered by the user.
    }

    // Method to calculate the student's grade based on their marks.
    public static String calculateGrade(double marks) {
        if (marks >= 80) {
            return "A"; // Grade A for marks >= 80.
        } else if (marks >= 69) {
            return "B"; // Grade B for marks 69-79.
        } else if (marks >= 55) {
            return "C"; // Grade C for marks 55-68.
        } else if (marks >= 41) {
            return "D"; // Grade D for marks 41-54.
        } else {
            return "F"; // Grade F for marks < 41.
        }
    }

    // Method to check if the student passed.
    public static boolean isPassed(String grade) {
        return !grade.equals("F"); // If grade is not F, student passed.
    }

    // Method to display the pass/fail count and bonus eligibility for the instructor.
    public static void displayResults(int passCount, int failCount) {
        String results = "\nPass: " + passCount + "\nFail: " + failCount; // Prepare the results message.
        if (passCount > failCount) {
            results += "\nBonus to instructor"; // Bonus if more students passed.
        } else {
            results += "\nNo bonus to instructor"; // No bonus if more students failed.
        }
        System.out.println(results); // Show results in the console.
    }
}