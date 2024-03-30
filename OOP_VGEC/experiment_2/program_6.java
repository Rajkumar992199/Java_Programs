import java.util.*;

public class program_6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = myObj.nextLine();
        int vowel_count = 0, consonant_count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowel_count++;
            } else {
                consonant_count++;
            }
        }
        System.out.println("Vowels are : " + vowel_count);
        System.out.println("Consonants are : " + consonant_count);
        myObj.close();
    }
}