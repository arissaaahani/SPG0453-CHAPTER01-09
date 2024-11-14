package dswe3; //arissa
import java.util.Scanner;
public class DSWE3 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String name = read.nextLine();
        
        System.out.print("Enter your last name: ");
        String name1 = read.nextLine();
        
        System.out.print("\nHello\n");
        System.out.print(name + " " + name1 + "\n");
        
    }
    
}
