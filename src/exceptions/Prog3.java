package exceptions;

import java.io.IOException;

public class Prog3 {
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main Ends");
	}

	public static void m1() {
		System.out.println("m1 starts ");
		m2();
		System.out.println("m1 ends");
	}

	public static void m2() {
		System.out.println("m2 starts ");
		try {
			m3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("m2 ends");
	}

	public static void m3() throws IOException {
		System.out.println("m3 starts");
		throw new IOException();

	}

}
