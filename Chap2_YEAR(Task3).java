package year;

import java.util.Scanner;

public class YEAR {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Current year: ");
        int current = scanner.nextInt();

        System.out.print("Birth year: ");
        int birth = scanner.nextInt();

        int age = current - birth;

        System.out.println("Your age is: " + age + " years old.");

        scanner.close();
    }
}
