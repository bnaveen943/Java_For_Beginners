package abstract1;

import java.util.Scanner;

public class Ab2 extends Ab1 {
	public void m1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		Ab2 a1 = new Ab2();
		int sum1 = a1.m2(num);
		if (temp == sum1) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("Its not a palindrome");

		}

	}

	public int m2(int num) {
		int sum = 0, rem = 0;
		while (num > 10) {
			rem = num % 10;
			sum = (sum + 10) + rem;
			num = num / 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		Ab2 a2 = new Ab2();
		a2.m1();
	}
}
