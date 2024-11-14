package converter;
import java.util.Scanner;
public class Converter {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Converter available :\n1. Currency (MYR - KRW)\n2. Mass (kg - pound)\n3. Distance (km - m)\nChoose your converter : ");
        int number = read.nextInt();
        
        switch (number){
            case 1:
                System.out.print("Insert Amount/Quantity(in RM): ");
                double curr = read.nextDouble();
                double duit = curr * 305.72497;
                System.out.println("\n\nRM" + String.format("%.2f",curr) + " = " + String.format("%.2f",duit) + "WON" );
                break;
                
            case 2:
                System.out.print("Insert Amount/Quantity(in kg): ");
                double kg = read.nextDouble();
                double pound = kg * 2.20462;
                System.out.println("\n\n" + String.format("%.2f",kg) + "kg" + " = " + String.format("%.2f",pound) + "pound" );
                break;
                
            case 3:
                System.out.print("Insert Amount/Quantity(in km): ");
                double km = read.nextDouble();
                double m = km * 1000;
                System.out.println("\n\n" + km + "km" + " = " + m + "m" );
                break;
                
            default:
                System.out.print("Invalid choice");
        }
    }//arissa
    
}

