package Practice3;
import java.util.*;

public class Statistics {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> num = new ArrayList<Double>();

        double sum = 0;
        System.out.print("Enter 10 number: ");
        for(int i=0; i<10; i++){
            double temp = input.nextDouble();
            sum += temp;
            num.set(i, temp);
        }

        double mean = sum/num.size();
        double std;

        for(int i=0; i<num.size(); i++){
            std = Math.sqrt(num.get(i)*(num.get(i)-mean)*(num.get(i)-mean));
            System.out.println(num.get(i) + " " + std);
        }

        input.close();
    }
    
}
