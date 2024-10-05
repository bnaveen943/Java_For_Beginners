package pack1;

public class Pri1 {
	private static int a=12;
	private String b="Naveen";
	private static void m1()
	{
		System.out.println("Inside static private ");
	}
	private void m2()
	{
		System.out.println("Insdie non_static private ");
	}
	public static void main(String[] args) {
		Pri1 a1=new Pri1();
		a1.m2();
		m1();
		System.out.println(a);
		System.out.println(a1.b);
	}
	/*
	 * Private specifier is a highest security lowest visibility 
	 * It can be access with the class only 
	 */

}
