import java.util.*;
public class program_5
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 3 numbers in Integer : ");
		int first = myObj.nextInt();
		int second = myObj.nextInt();
		int third = myObj.nextInt();
		System.out.println("decreasing order : ");
		if(first>=second){
			if(first>=third){
				System.out.print(first +" ");
                if(second>=third){
				    System.out.print(second +" ");
                    System.out.print(third +" ");
				}
                else{
                    System.out.print(third +" ");
                    System.out.print(second +" ");
                }
				}
			else{
				System.out.print(third +" ");
                System.out.print(first +" ");
                System.out.print(second +" ");
				}
			}
		else{
			if(second>=third){
				System.out.print(second +" ");
                if(first>=third){
				    System.out.print(first +" ");
                    System.out.print(third +" ");
				}
                else{
                    System.out.print(third +" ");
                    System.out.print(first +" ");
                }
				}
			else{
				System.out.print(third +" ");
                System.out.print(second +" ");
                System.out.print(first +" ");
				}
			}
	}
}