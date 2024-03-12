import java.util.*;
public class program_4
{
	public static void main(String arg[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter weight in pound : ");

		Double pound = myObj.nextDouble();
		Double kilo = pound *0.45359237;

        System.out.println("Enter height in inches : ");
		Double inch = myObj.nextDouble();
		Double meter = inch *0.0254;
		Double bmi = kilo / (Math.pow(meter,2));
		System.out.println(pound + " pound is " + kilo  + " kg.");
		System.out.println(inch + " inches is " + meter  + " meter.");
		System.out.println("BMI : " +bmi);
	}
}