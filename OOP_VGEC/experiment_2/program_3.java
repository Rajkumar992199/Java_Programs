import java.util.Scanner;

public class program_3 {
    public static int rmDup(int array[], int n) {
        int[] temp = new int[n];
        int j = 0;
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0;k <i+1 ;k++){
                if(k==i){
                    temp[j++] = array[i]; 
                    break;
                }
                if (array[i] == array[k]){
                    break;
                }
            }  
            
        }
        
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n,i;
        System.out.println("enter the size of Array :");
        n = myObj.nextInt();
        int array[] = new int[n];
        System.out.println("enter the elements of Array :");
         for (i = 0; i < n; i++) {
            array[i] = myObj.nextInt();
         }
        System.out.print("\nArray with duplicate number are : ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int length = rmDup(array, n);
        System.out.print("\nNew array is : ");
        for (i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        myObj.close();
    }
}