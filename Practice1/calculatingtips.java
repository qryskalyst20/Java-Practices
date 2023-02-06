package Practice1;
import java.util.*;

public class calculatingtips {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuitity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        gratuity*=subtotal/100;
        subtotal+=gratuity;
        

        System.out.println("The gratuity is $" + String.format("%.2f", gratuity) + " and the total is $" + subtotal);
        input.close();
    }
}
