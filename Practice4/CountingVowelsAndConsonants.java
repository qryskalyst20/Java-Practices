import java.util.*;

public class CountingVowelsAndConsonants {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();
        inputString = inputString.replaceAll("\\s", "");

        int vowel=0, consonant=0;

        for(int i=0; i<inputString.length(); i++){
            if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u'){
                vowel++;
            }else{
                consonant++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

        input.close();
    }

    
}
