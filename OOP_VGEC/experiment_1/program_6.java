import java.util.*;
public class program_6
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a character : ");

		char ch = myObj.next().charAt(0);
		if (ch == 'A' || ch == 'a' ||
            ch == 'E' || ch == 'e' ||
            ch == 'I' || ch == 'i' ||
            ch == 'O' || ch == 'o' ||
            ch == 'U' || ch == 'u') 
			{System.out.println("Entered character is vowel");
        } else {
            System.out.println("Entered character is consonants");
        }

	}
}