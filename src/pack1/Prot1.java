package pack1;

public class Prot1 {
	protected static int a=10;
	protected int b=23;
	protected static void m1()
	{
		System.out.println("Insde m1 method");
	}
	protected void m2()
	{
		System.out.println("Inside nonstatic method");
	}
	public static void main(String[] args) {
		Prot1 as=new Prot1();
		as.m2();
		m1();
		System.out.println(as.b);
		System.out.println(a);
	}

}
