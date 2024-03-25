import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of names you want to enter : ");
        int n = myObj.nextInt();
        String array[] = new String[n];
        array[0] = myObj.nextLine();
        for (int j = 0; j < n; j++) {
            array[j] = myObj.nextLine();
        }
        if (array.length == 0) {
            System.out.println("No student names provided.");
            return;
        }

        int numArgs = array.length;
        String[] numericStrings = {
                "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth",
                "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth", "Seventeenth",
                "Eighteenth", "Nineteenth", "Twentieth"
        };

        System.out.println("Number of arguments = " + numArgs);
        for (int i = 0; i < numArgs; i++) {
            System.out.println((i + 1) + ": " + numericStrings[i] + " Student Name is = " + array[i]);
        }
    }
}