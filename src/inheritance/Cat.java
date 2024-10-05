package inheritance;

public class Cat implements F{
	public void m1()
	{
		System.out.println("Hello man");
	}
	public void m2()
	{
		System.out.println("Inside m2 method ");
	}
	public static void main(String[] args) {
		Cat a1=new Cat();
		a1.m1();
		a1.m2();
	}

}
