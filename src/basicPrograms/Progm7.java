package basicPrograms;

import java.util.Scanner;

public class Progm7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		Progm7 ams = new Progm7();
		int sum1 = ams.amstrong(num);
		int temp = num;
		if (temp == sum1) {
			System.out.println(sum1 + " is a amstrong number ");
		} else {
			System.out.println(sum1 + " is not a amstrong numbetr ");
		}

	}

	public int amstrong(int num) {

		int rem = 0, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = (rem * rem * rem) + sum;
			num = num / 10;
		}
		return sum;

	}

}
