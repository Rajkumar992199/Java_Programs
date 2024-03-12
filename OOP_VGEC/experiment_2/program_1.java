import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        int i, j;

        Scanner myObj = new Scanner(System.in);
        int array[][] = new int[6][6];
        System.out.println("Enter the values of Array :");
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                array[i][j] = myObj.nextInt();
            }
            System.out.println();
        }

        System.out.println("array is : ");
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < 6; i++) {
            int countRow = 0, int countColumn = 0;
            for (j = 0; j < 6; j++) {
                if (array[i][j] == 1) {
                    countRow++;
                }
                if (array[j][i] == 1) {
                    countColumn++;
                }
            }
            if (countRow % 2 != 0) {
                System.out.println("Row " + (i + 1) + " contains odd number of 1's");
            }
            if (countColumn % 2 != 0) {
                System.out.println("Column " + (i + 1) + " contains odd number of 1's");
            }
        }
    }
}