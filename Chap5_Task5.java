package task.pkg5;
import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        

        System.out.println("Enter the name of the first student: ");
        String name1 = read.nextLine();
        System.out.println("Enter the marks for " + name1);
        double mark1_1 = getValidMark(read, "Enter mark 1:");
        double mark1_2 = getValidMark(read, "Enter mark 2:");
        double mark1_3 = getValidMark(read, "Enter mark 3:");

        student student1 = new student(name1, mark1_1, mark1_2, mark1_3);

        System.out.println("Enter the name of the second student: ");
        String name2 = read.nextLine();
        System.out.println("Enter the marks for " + name2);
        double mark2_1 = getValidMark(read, "Enter mark 1:");
        double mark2_2 = getValidMark(read, "Enter mark 2:");
        double mark2_3 = getValidMark(read, "Enter mark 3:");

        student student2 = new student(name2, mark2_1, mark2_2, mark2_3);

        System.out.println("Enter the name of the third student: ");
        String name3 = read.nextLine();
        System.out.println("Enter the marks for " + name3);
        double mark3_1 = getValidMark(read, "Enter mark 1:");
        double mark3_2 = getValidMark(read, "Enter mark 2:");
        double mark3_3 = getValidMark(read, "Enter mark 3:");

        student student3 = new student(name3, mark3_1, mark3_2, mark3_3);

        average. displayAvenHigh(student1, student2, student3);}
        
    public static double getValidMark(Scanner read,String prompt){
        double mark;
        while (true) {
            System.out.println(prompt);
            if (read.hasNextDouble()) {
                mark = read.nextDouble();
                if (mark >= 0 && mark <= 100) {
                    read.nextLine(); 
                    break;
                } else {
                    System.out.println("Please enter a mark between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                read.nextLine(); 
            }
    }
        return mark;
}
}