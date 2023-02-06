package Practice1;
import java.util.*;

public class Frame{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();
        double width = length*5;

        System.out.println("Length: " + String.format("%.2f", length) + "cm");
        System.out.println("Width: " + String.format("%.2f", width) + "cm");
        input.close();
    }
}