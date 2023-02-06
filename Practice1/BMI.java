package Practice1;
import java.util.*;

public class BMI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pound: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        weight*=0.45359237;
        height*=0.0254;

        double BMI = weight/Math.pow(height, 2);
        System.out.println("BMI is " + String.format("%.4f", BMI));
        input.close();
    }
}
