package Practice1;
import java.util.*;

public class TriangularPrism {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");

        double sides = input.nextDouble();
        double height = input.nextDouble();

        double area = (Math.sqrt(3)/4)*Math.pow(sides, 2);
        double volume = area*height;

        System.out.println("The area is " + String.format("%.2f", area));
        System.out.println("The volume of the triangular prism is " + String.format("%.2f", volume));
        input.close();

    }
}
