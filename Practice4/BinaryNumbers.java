import java.util.*;

public class BinaryNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimals = Integer.parseInt(binary, 2);

        System.out.println("Decimals: " + decimals);
        input.close();
    }
}
