package pack1;

public class Def1 {
	static double d = 23.5;
	String s = "Hallieki";

	void m1() {
		System.out.println("Default specifier ");
	}

	static void m2() {
		System.out.println("Default static ");
	}

	public static void main(String[] args) {
		Def1 a1=new Def1();
		a1.m1();
		Def1.m2();
		System.out.println(a1.s);
		System.out.println(d);
	}
}
