package even.n.odd;

public class EvenNOdd {

    public static void main(String[] args) {
        
        int numeven = 0;
        int numodd = 0;
        for (int i = 1;i <= 10;i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
                numeven += i;}
}
        System.out.println("\nSum of even numbers: " + numeven);
    
        for (int i = 1;i <= 10;i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
                numodd += i;}
}
        System.out.println("\nSum of odd numbers: " + numodd);
    }
}