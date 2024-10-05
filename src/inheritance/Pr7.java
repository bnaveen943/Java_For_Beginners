package inheritance;

public class Pr7 extends Pr6 {
	public void vehicle() {
		System.out.println("I want to buy bike");
	}
	public static void main(String[] args) {
		Pr7 a1=new Pr7();
		a1.vehicle();
		Pr6 a2=new Pr6();
		a2.vehicle();
	}
}
 