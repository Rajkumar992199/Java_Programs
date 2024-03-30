import java.util.*;

public class program_7 {
    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix.append(str1.charAt(i));
            } else {
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = myObj.nextLine();

        System.out.println("Enter the second string:");
        String str2 = myObj.nextLine();

        String commonPrefix = findCommonPrefix(str1, str2);

        System.out.println("Largest Common Prefix: " + commonPrefix);

        myObj.close();
    }
}