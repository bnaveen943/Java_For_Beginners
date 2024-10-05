package pack2;
import pack1.Pub1;
public class Publ1 {
	public static void main(String[] args) {
		Pub1 a1=new Pub1();
		a1.m2();
		Pub1.m1();
		System.out.println(Pub1.a+ " is static 1st value ");
		System.out.println(Pub1.b+" is static 2nd value");
		/*
		 * Public member can access same package as well as different package by using 
		 * import package_name.class_name
		 */
	}

}
