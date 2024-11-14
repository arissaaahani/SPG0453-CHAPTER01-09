package arithmetic.prog;
import java.util.Scanner;
public class ArithmeticProg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.print("Enter 1st Integer:");
        x = scanner.nextInt();
        
        System.out.print("Enter 2nd Integer:");
        y = scanner.nextInt();
        
        int total = x + y;
        int diff = x - y;
        int multi = x * y;
        int divide = x / y;
        int remain = x % y;
        int incre1 = x++ ;
        int incre2 = y++ ;
        int decre1 = x-- ;
        int decre2 = y-- ;
        
        System.out.println("Sum :"+total);
        System.out.println("Difference :"+diff);
        System.out.println("Multiplication :"+multi);
        System.out.println("Divide :"+divide);
        System.out.println("Remainder :"+remain);
        System.out.println("Increment(1) :"+incre1);
        System.out.println("Increment(2) :"+incre2);
        System.out.println("Decrement(1) :"+decre1);
        System.out.println("Decrement(2) :"+decre2); 
    }
    
}
