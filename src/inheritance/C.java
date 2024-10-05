package inheritance;

public class C extends A {
	public void m3()
	{
		System.out.println("Class C");
	}
	public static void main(String[] args) {
		C a1 = new C();
		a1.m1();
		a1.m3();
		
		B a2 =new B();
		a2.m2();
		a2.m1();
		
		C a3 = new C();
		a3.m1();
		a3.m3();
	}

}
