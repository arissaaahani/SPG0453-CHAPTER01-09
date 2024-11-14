package project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert name: ");
        String name = scanner.nextLine();

        System.out.print("Insert age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Insert hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Insert favorite food: ");
        String favFood = scanner.nextLine();

        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favFood);

        scanner.close();
    }
}
