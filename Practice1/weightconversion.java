package Practice1;
import java.util.Scanner;

public class weightconversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kg: ");
        double kg  = input.nextDouble();

        System.out.println("Weight in pounds: " + kg*2.2);
        input.close();
    }
}
