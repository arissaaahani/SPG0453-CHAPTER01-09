package pkgclass.main;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        GradeClass kelas = new GradeClass();
        int[] marks = new int[10];
        int[] gradeCount = new int[5]; 
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = read.nextInt();
            
            char grade = kelas.determineGrade(marks[i]);
            switch (grade) {
                case 'A':
                    gradeCount[4]++;
                    break;
                case 'B':
                    gradeCount[3]++;
                    break;
                case 'C':
                    gradeCount[2]++;
                    break;
                case 'D':
                    gradeCount[1]++;
                    break;
                case 'E':
                    gradeCount[0]++;
                    break;
            }
        }

        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCount[4]);
        System.out.println("Grade B: " + gradeCount[3]);
        System.out.println("Grade C: " + gradeCount[2]);
        System.out.println("Grade D: " + gradeCount[1]);
        System.out.println("Grade E: " + gradeCount[0]);
    }
}

