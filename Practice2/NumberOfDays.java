package Practice2;
import java.util.*;

public class NumberOfDays {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.YEAR, year);

        System.out.println("There are " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
        // System.out.println("Year is " + calendar.getActualMaximum(Calendar.YEAR));

        input.close();
    }    
}
