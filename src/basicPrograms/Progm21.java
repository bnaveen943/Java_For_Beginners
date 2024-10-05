package basicPrograms;

import java.util.Scanner;

public class Progm21 {
	public static void main(String[] args) {
		Progm21 a1 = new Progm21();
		m4();
	}

	public void m1() {
		String str = "mohana";
		char[] ch = str.toCharArray();
		System.out.println("Retrive data from the string array");
		for (int i = 0; i < ch.length; i++) {
			System.out.println();
		}

	}

	public void m2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a your string");
		String s = scanner.nextLine();
		System.out.println("Vowels from the string ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println(s.charAt(i));
			}
		}

	}

	public static void m3() {
		String str = "naveen";
		int size = str.length();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count = count + 1;
			}

		}
		System.out.println("count the character " + count);
	}

	public static void m4() {

		Scanner cs = new Scanner(System.in);
		String str1 = cs.nextLine();
		String str2 = cs.nextLine();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					System.out.println(str1);
				}
			}
		}

	}

}
