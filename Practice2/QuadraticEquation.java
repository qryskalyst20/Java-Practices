package Practice2;
import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2)-(4*a*c);
        if (discriminant < 0){
            System.out.println("The equation has no real roots");
        }else{
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            if(x1==x2){
                System.out.println("The equation has one root " + x1);
            }else{
                System.out.println("The equation has two roots " + x1 + " and " + x2);
            }
        }

        

        input.close();
    }
}
