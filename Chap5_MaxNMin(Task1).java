package max.n.min;
import java.util.Scanner;

public class MaxNMin {
    public static void main(String[] args) {
        MathUtils med = new MathUtils();
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[3];
        int i = 0;

        while (i < 3) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = read.nextInt();
            i++;
        }
        
        int max = med.findMax(numbers[0], numbers[1], numbers[2]);
        int min = med.findMin(numbers[0], numbers[1], numbers[2]);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }
}

