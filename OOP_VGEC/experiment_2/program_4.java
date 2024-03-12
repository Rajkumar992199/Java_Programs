import java.util.*;

public class program_4 {
    public static void Addition(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = array1[i][j] + array2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Subtraction(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = array1[i][j] - array2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Multiplication(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for(int k=0;k<3;k++){
                c[i][j] += array1[i][k] * array2[k][j] ;
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int array1[][] = new int[3][3];
        int array2[][] = new int[3][3];
        System.out.println("Enter the values of Array1 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array1[i][j] = myObj.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the values of Array2 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2[i][j] = myObj.nextInt();
            }
            System.out.println();
        }

        System.out.println("Original array 1 is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Original array 2 is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter + for addition\nEnter - for subtraction\nEnter * for multiplication : ");
        char operator = myObj.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Addition is selected");
                Addition(array1, array2);
                break;
            case '-':
                System.out.println("Subtraction is selected");
                Subtraction(array1, array2);
                break;
            case '*':
                System.out.println("Multiplication is selected");
                Multiplication(array1, array2);
                break;

            default:
                System.out.println("Write valid number");
        }
        myObj.close();
    }
}
