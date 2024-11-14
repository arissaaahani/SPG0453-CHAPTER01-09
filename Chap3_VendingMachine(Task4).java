package vendingmachine; // easy to arrange which group
import java.util.Scanner; //to bring the library
public class VendingMachine { //to state the classname
    public static void main(String[] args) { //to run the code
        Scanner read = new Scanner(System.in); //read is the object , System.in allows to insert input
        
        System.out.print("Enter the item number: \n1. Cadbury\n2. Mr.Potato\n3. Ice Lemon Tea\nAnswer :"); //to display the statement
        int item = read.nextInt(); // .nextInt is to read the the next integer from input
        
        System.out.print("Enter the quantity of the item: ");
        int quantity = read.nextInt();
        read.close(); //to stop the scanner object
        
        double total; // to declare the variable
        switch(item){ //to execute one statemnet in many condition
            case 1:
                System.out.println("Cadbury = RM 5.00");
                total = quantity*5.00;
                System.out.println("Your total amount is : RM " +total);
                break;
            case 2:
                System.out.println("Mr.Potato = RM 3.50");
                total = quantity*3.50;
                System.out.println("Your total amount is : RM "+total);
                break;
            case 3:
                System.out.println("Ice Lemon Tea = RM 2.00");
                total = quantity*2.00;
                System.out.println("Your total amount is : RM "+total);
                break;
            default: // other than the choices given
                System.out.println("Invalid");
                break;
        }
        read.close();  
    }
    
}
