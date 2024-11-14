package javaapplication41;

public class NewClass {
    public static void main(String str[]) {
        int y = 0;
        int x = 1;
        try {
            int z = x / y;
            System.out.println("after division");
        } catch (ArithmeticException ae) {
            System.out.println("attempt to divide by 0");
        }
        System.out.println("after catch");
    }
}
