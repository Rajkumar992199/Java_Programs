import java.util.*;
public class program_3
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number in meter: ");

		Double meter = myObj.nextDouble();
		Double feet = meter *3.2808399;
		System.out.println(meter + " meter is " + feet  + " feet.");
	}
}