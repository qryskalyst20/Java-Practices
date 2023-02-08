package Practice2;
import java.util.*;

public class BMI {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        weight*=0.45359237;
        height*=0.0254;

        double BMI = weight/Math.pow(height, 2);

        System.out.println("Your BMI is " + String.format("%.4f", BMI));

        if(BMI<18.5){
            System.out.println("You are underweight");
        }else if(BMI>=18.5 && BMI<25){
            System.out.println("You are normal");
        }else if(BMI>=25 && BMI<30){
            System.out.println("You are overweight");
        }else{
            System.out.println("You are obese");
        }

        input.close();
    }


}
