package kis.deduction;

public class KISDeduction {

    public static void main(String[] args) {
        double latenumber = 5;
        double kisdeduct = 0.3;
        double deduction_kis = 0;
        
        if (latenumber>3) {
            deduction_kis = (kisdeduct*latenumber);
        }
            
            System.out.println("Deduct mark is :"+deduction_kis);
    }
    
}
