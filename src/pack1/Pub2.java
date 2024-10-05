package pack1;

public class Pub2 {
	public static void main(String[] args) {
		Pub1 a1=new Pub1();
		
		a1.m2();
		Pub1.m1();
		System.out.println(Pub1.a);
		System.out.println(Pub1.b);
	}

	
}
