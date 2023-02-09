package Practice3;
import java.util.*;

public class SumofDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
        input.close();
    }
}