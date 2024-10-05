package pack1;

public class Pub1 {
	public static int a=10;
	public static int b=23;
	public static void m1()
	{
		System.out.println("Insde m1 method");
	}
	public void m2()
	{
		System.out.println("Inside nonstatic method");
	}
	public static void main(String[] args) {
		Pub1 as=new Pub1();
		as.m2();
		m1();
		System.out.println(b);
		System.out.println(a);
	}

}
