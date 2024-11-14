
package sequence;

import java.util.Scanner;
public class fail {
    
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

        int passed = 0;
        int failed = 0;
        
        System.out.print("Enter the number of students: ");
        int numberStu = read.nextInt();

        for (int i = 1; i <= numberStu; i++) {
            System.out.print("Enter result for student " + i + " (1 for pass, 0 for fail): ");
            int result = read.nextInt();

            if (result == 1) {
                passed++;
            } else if (result == 0) {
                failed++;
            } else {
                System.out.println("Invalid input. Please enter 1 for pass or 0 for fail.");
                i--; 
            }
        }

        
        System.out.println("\nNumber of students passed: " + passed);
        System.out.println("Number of students failed: " + failed);

        if (passed > numberStu / 2) {
            System.out.println("Bonus to instructor.");
        }

    }
    
}
