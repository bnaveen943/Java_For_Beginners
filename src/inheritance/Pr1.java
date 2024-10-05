package inheritance;

public class Pr1 {
	int a = 12;

	Pr1() {
		int a = 23;
		System.out.println(this.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Pr1 a1 = new Pr1();

	}
}
