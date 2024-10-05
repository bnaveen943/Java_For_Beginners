package basicPrograms;

import java.util.Scanner;

public class Progm8 {
	public static void main(String[] args) {
		Progm8 cat = new Progm8();
		cat.prime();
		System.out.println(cat instanceof Progm8);
	}

	public void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		int count1 = pr(num, count);
		if (count1 == 2) {
			System.out.println("Enter number is a prime " + num);
		} else {
			System.out.println("Enter number is not prime " + num);
		}
		/*
		 * This below code is for to check the number is perfect
		 */
		System.out.println("Enter a number1 ");
		int num1 = sc.nextInt();
		int sum1 = perfect(num1, sum);
		if (sum1 == num1) {
			System.out.println("Enter number is perfect " + sum1);
		} else {
			System.out.println("Enter number is not perfect" + num1);

		}
	}

	public int pr(int num, int count) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;

	}

	public int perfect(int num1, int sum) {
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum = sum + i;
			}
		}
		return sum;

	}

}
