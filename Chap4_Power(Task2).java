package power;

public class Power {

    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 10; i++){
            int kuasa = i * i;
            System.out.println(i + "^2 = " + kuasa);
            sum += kuasa;
        }
        System.out.println("Total of powers of 2 from 1 - 10 : " + sum);
    }
    
}
