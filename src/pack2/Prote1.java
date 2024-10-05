package pack2;
import pack1.Prot1;
public class Prote1 extends Prot1 {
	public static void main(String[] args) {
		Prote1 a2=new Prote1();
		a2.m2();
		Prot1.m1();
		System.out.println(Prot1.a + "In protected");
		System.out.println(a2.b);
	}
	/*
	 * Protect specifier can access different package also with the use of inheritance(IS_A) relation ship
	 */

}
