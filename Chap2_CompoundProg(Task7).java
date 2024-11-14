package compound.prog;

public class CompoundProg {

    public static void main(String[] args) {
        
        int num = 6;
        //Increases the value of num by 1 before its value is used in the expression
        System.out.println("Initial value: " + num);
        System.out.println("Pre-increment (++num): " + ++num);
        System.out.println("Value after pre-increment: " + num);

        num = 6;
        //Uses the current value of num in the expression and then increases its value by 1
        System.out.println("\nInitial value: " + num);
        System.out.println("Post-increment (num++): " + num++);
        System.out.println("Value after post-increment: " + num);

        num = 6;
        //Decreases the value of num by 1 before its value is used in the expression
        System.out.println("\nInitial value: " + num);
        System.out.println("Pre-decrement (--num): " + --num);
        System.out.println("Value after pre-decrement: " + num);

        num = 6;
        //Uses the current value of num in the expression and then decreases its value by 1
        System.out.println("\nInitial value: " + num);
        System.out.println("Post-decrement (num--): " + num--);
        System.out.println("Value after post-decrement: " + num);
    }
}

