public class program_2
{
	public static void main(String arg[])
	{
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5 ,f = 5.9;
        double det = a*d - b*c ;
        double x = (e*d - b*f) / det ;
        double y = (a*f - e*c) / det ;
        System.out.println("X is : " + x);
	 System.out.println("Y is : " + y);
    }

}