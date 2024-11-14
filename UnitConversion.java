package unit.conversion;
import java.util.Scanner;
public class UnitConversion {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Temperature tempConver = new Temperature();
        Distance DisConver = new Distance();
        Weight WeightConver = new Weight();
        
        System.out.print("\nUnit Conversion :\n1.Temperature (Celsius-Fahrenheit)\n2. Distance (Km-m)\n3. Weight (Kg-g)\nAnswer : ");
        int option = read.nextInt();
        double input, result;
        
        switch (option){
            case 1:
                System.out.print("Celsius :");
                input = read.nextDouble();
                result = tempConver.celsiusToFahrenheit(input);
                System.out.println(input + " Celsius = " + result + " Fahrenheit");
                break;
            case 2:
                System.out.print("Distance (Km) :");
                input = read.nextDouble();
                result = DisConver.kilometerToMeter(input);
                System.out.println(input + " Kilometer = " + result + " Meter");
                break;
            case 3:
                System.out.print("Weight (Kg) :");
                input = read.nextDouble();
                result = WeightConver.kilogramToGram(input);
                System.out.println(input + " Kilogram = " + result + " Gram");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
