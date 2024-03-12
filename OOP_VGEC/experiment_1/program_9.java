import java.util.Scanner;

public class program_9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = myObj.nextInt();
        System.out.println("Enter b : ");
        int b = myObj.nextInt();
        System.out.println("Enter c : ");
        int c = myObj.nextInt();

        int s = (a + b  + c) / 2;

        System.out.println("Area of triangle is : " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
