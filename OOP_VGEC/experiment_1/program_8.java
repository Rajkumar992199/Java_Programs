import java.util.*;
public class program_8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = myObj.nextInt();

        int digit1 = (num / 10000 + 1) % 10;
        int digit2 = ((num / 1000) % 10 + 1) % 10;
        int digit3 = ((num / 100) % 10 + 1) % 10;
        int digit4 = ((num / 10) % 10 + 1) % 10;
        int digit5 = (num % 10 + 1) % 10;

        int Num1 = digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10 + digit5;

        System.out.println("New number after adding one to each digit: " + Num1);
    }
}
