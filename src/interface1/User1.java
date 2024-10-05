package interface1;

public class User1 extends Pets implements Inter1, Inter2, Inter3 {
	public void m1() {
		System.out.println("Inside nonstatic method m1");
	}

	public void m2() {
		System.out.println("Inside nonstatic method m2");
	}

	public void m3() {
		System.out.println("Inside nonstatic methos m3");
	}
	
	public static void main(String[] args) {
		User1 a1=new User1();
		a1.m1();
		a1.m3();
		a1.m3();
		a1.cat();
		
	}
}
