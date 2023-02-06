package Practice2;
import java.util.*;

public class Salary {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of hours worked: ");
        double hours = input.nextDouble();

        if(hours<40){
            hours*=12;
        }else{
            hours-=40;
            hours*=18;
            hours+=(40*12);
        }

        System.out.println("Salary due: RM" + String.format("%.2f", hours));
    }

}
