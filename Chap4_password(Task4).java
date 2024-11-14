package sequence;

import java.util.Scanner;
public class password {
        public static void main(String[] args){
            final String Correct = "arissa hani";
            final int max = 5;
            int attempt = 0;
            
            Scanner read = new Scanner(System.in);
            
            while (attempt < max) {
                System.out.print("Enter password : ");
                String input = read.nextLine();
                
                if (input.equals(Correct)) {
                    System.out.println("OPEN SESAMEEEE. Welcome!");
                    break;
                }else {
                    attempt ++;
                    System.out.println("NOOOO NOOOOO. You have " + (max - attempt));
                }
                if (attempt == max){
                    System.out.println("Maximum attempts reached. Denied");
                }
            }
        }
}
