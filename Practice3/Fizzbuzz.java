package Practice3;
import java.util.*;

public class Fizzbuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for(int i=1;i<=10;i++){
            for(int j=1; j<=10; j++){
                
                n++;
                if(n%3==0 && n%5==0){
                    System.out.print(" FizzBuzz ");
                }else if(n%3==0){
                    System.out.print(" Fizz ");
                }else if(n%5==0){
                    System.out.print(" Buzz ");
                }else{
                    System.out.print(" " + n + "");
                }
                
            }
            System.out.println("");
            
        }
        sc.close();
    }
    
}
