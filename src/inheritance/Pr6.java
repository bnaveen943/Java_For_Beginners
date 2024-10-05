package inheritance;

public class Pr6 {
	public void vehicle()
	{
		System.out.println("I am intrested to buy a car");
	}
	
	public static void add(int a,int b)
	{
		System.out.println("addition of two number");
	}
	public static double add(double d,int c)
	{
		double s=d+c;	
		return s;
		
	}
	public static void main(String[] args) {
		add(20,30);
		double s1=add(23.5,35);
		System.out.println(s1);
	}

}
