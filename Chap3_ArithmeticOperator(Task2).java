package arithmetic.operator; // easy to arrange which group

import java.util.Scanner; //to bring the library
public class ArithmeticOperator { //to state the classname

    public static void main(String[] args) { //to run the code
        
        Scanner read = new Scanner(System.in); //read is the object , System.in allows to insert input

        System.out.print("Enter 1st number : "); //to display the statement
        int number1 = read.nextInt(); // .nextInt is to read the the next integer from input
        
        System.out.print("Enter 2nd number : ");
        int number2 = read.nextInt();
        
        System.out.print("Enter which number of operator : \n1. +\n2. -\n3. *\n4. /\nAnswer:");
        int operator = read.nextInt();
        
        int sum = number1 + number2; //to declare the variable of which datatypes
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;
        
        switch (operator){ // same with if else but more easy to use
            case 1:System.out.println(sum);break; // each choices has different content
            case 2:System.out.println(sub);break; // break; is used at the end to stop the code from continuous execute
            case 3:System.out.println(mul);break;
            case 4:System.out.println(div);break;
            default:System.out.println("Invalid");break; // other than the choices given
        }
    
    }
    
}
