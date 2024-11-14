/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputexp;

import java.util.Scanner;

public class InputExp {

    
    public static void main(String[] args) {
        
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        
        // Reads a single line from the console
        // and stores into name variable
        name = in.nextLine();
        
        //Reads a integer from the console
        // and stores into age variable
        age = in.nextInt();
        in.close();
        
        //Prints name and age to the console
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        
    }
    
}
