import java.util.*;
public class program_7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the amount to be withdrawn: ");
        int amount = myObj.nextInt();

        int hundred = amount/100;
        amount %= 100;

        int fifty = amount/50;
        amount %= 50;

        int ten = amount/10;
        amount %= 10;

        int five = amount/5;
        amount %= 5;

        int two = amount/2;
        amount %= 2;

        int one = amount;

        System.out.println("Currency Notes Distribution:");
        System.out.println("100 : " + hundred);
        System.out.println("50  : " + fifty);
        System.out.println("10  : " + ten);
        System.out.println("5   : " + five);
        System.out.println("2   : " + two);
        System.out.println("1   : " + one);
    }
}
