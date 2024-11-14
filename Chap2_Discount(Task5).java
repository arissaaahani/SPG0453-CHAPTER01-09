package discount; // easy to arrange which group
import java.util.Scanner; //to bring the library
public class Discount { //to state the classname
    public static void main(String[] args) { //to run the code
        Scanner read = new Scanner(System.in); //read is the object , System.in allows to insert input

        System.out.print("Enter the item name: "); //to display the statement
        String item = read.nextLine(); // .nextLine is to read the the next text from input
        
        System.out.print("Enter the price of the item: ");
        double price = read.nextDouble(); // .nextDouble is to read the the next double value from input

        System.out.print("Enter the quantity of the item: ");
        int quantity = read.nextInt(); // .nextInt is to read the the next integer from input

        System.out.print("Choose colour of the discount rate : \n1.Red = 80%\n2.Blue = 60%\n3.Green = 40%\n");
        int discRate = read.nextInt(); //to declare the variable in which datatypes
        double priceAfterDisc = 0.0;
        double totalPrice;
        double discAmount = 0;
        int red = 0;
        
        if (discRate == 1){ //to make condition
            red = 80;
            totalPrice = price * quantity;
            discAmount = totalPrice * (80.0 / 100);
            priceAfterDisc = totalPrice - discAmount;
        }
        else if (discRate == 2){
            red = 60;
            totalPrice = price * quantity;
            discAmount = totalPrice * (60.0 / 100);
            priceAfterDisc = totalPrice - discAmount;
        }
        
        else if (discRate == 3){
            red = 40;
            totalPrice = price * quantity;
            discAmount = totalPrice * (40.0 / 100);
            priceAfterDisc = totalPrice - discAmount;
        }
        else{
            System.out.println("Invalid");
            return; //to end the condition
        }

        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + item);
        System.out.println("Price: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + red + "%");
        System.out.println("Price After Discount: RM" +String.format("%.2f",priceAfterDisc)); // to make the output only 2 decimal places

    }
}
