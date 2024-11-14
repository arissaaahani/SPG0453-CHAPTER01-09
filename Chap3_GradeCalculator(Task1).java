package grade.calculator; // easy to arrange which group
import java.util.Scanner; //to bring the library
public class GradeCalculator { //to state the classname

    public static void main(String[] args) { //to run the code
        
        Scanner read = new Scanner(System.in); //read is the object , System.in allows to insert input

        System.out.print("Enter your Marks : "); // to display the statement
        int grade = read.nextInt(); // .nextInt is to read the the next integer from input
        
        if (grade >= 90){ // to make condition
            System.out.println("Grade = A+");
        }
        else if (grade >= 80){
            System.out.println("Grade = A");
        }
        else if (grade >= 70){
            System.out.println("Grade = B+");
        }
        else if (grade >= 60){
            System.out.println("Grade = B-");
        }
        else if (grade >= 50){
            System.out.println("Grade = C+");
        }
        else if (grade >= 40){
            System.out.println("Grade = C");
        }
        else if (grade >= 30){
            System.out.println("Grade = D");
        }
        else{
            System.out.println("Grade = F");
        }
    }
    
}
