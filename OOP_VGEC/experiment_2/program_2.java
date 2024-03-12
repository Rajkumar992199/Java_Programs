import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        int i, j,min=0;

        Scanner myObj = new Scanner(System.in);
        int array[][] = new int[2][2];
        System.out.println("Enter the values of Array :");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                array[i][j] = myObj.nextInt();
            }
            System.out.println();
        }
        System.out.println("array is : ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int c = array[0][0]*2;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                if(array[i][j]<= c){
                    min = array[i][j];
                }
                c = array[i][j];
            }
            System.out.println();
        }
        System.out.println("Minimum element is: "+ min);
    }
}