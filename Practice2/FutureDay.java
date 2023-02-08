package Practice2;
import java.util.*;

public class FutureDay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> daymap = new HashMap<Integer, String>(){{
            put(1, "Monday");
            put(2, "Tuesday");
            put(3, "Wednesday");
            put(4, "Thursday");
            put(5, "Friday");
            put(6, "Saturday");
            put(0, "Sunday");
        }};

        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        while(elapsed>6){
            elapsed-=7;
        }

        System.out.println("Today is " + daymap.get(day) + " and the future day is " + daymap.get(day+elapsed));
        input.close();
    }
}
