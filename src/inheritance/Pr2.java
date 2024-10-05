package inheritance;

public class Pr2 extends Pr1 {
	int a=122;
	public void m1()
	{
		System.out.println(""+a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Pr2 a2=new Pr2();
		a2.m1();
	}

}
