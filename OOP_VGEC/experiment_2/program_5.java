import java.util.*;

public class program_5 {
    public static void sort(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                int temp = 0;
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n, i;
        System.out.println("enter the size of Array :");
        n = myObj.nextInt();
        int array[] = new int[n];
        System.out.println("enter the elements of Array :");
        for (i = 0; i < n; i++) {
            array[i] = myObj.nextInt();
        }
        System.out.print("\nUnsorted Array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sort(array);
        System.out.print("\nSorted array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}