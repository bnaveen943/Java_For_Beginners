package pack1;

public class Prot2 {
	public static void main(String[] args) {
		Prot1 aq=new Prot1();
		Prot1.m1();
		aq.m2();
		System.out.println(Prot1.a);
		System.out.println(aq.b);
	}

}
