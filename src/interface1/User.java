package interface1;

import java.util.Scanner;

public class User implements Int1, Int2 {

	public void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("Enter number is prime "+num);
		} else {
			System.out.println("Enter number is not prime "+num);

		}
	}

	public void palindrome() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a palindrome number ");
		int num=scanner.nextInt();
		int temp=num,rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if (temp==sum) {
			System.out.println("Enter number is palindrome "+sum);
		} else {
			System.out.println("Enter numbers is not palindrome "+sum);

		}

	}

	public static void main(String[] args) {
		User pp =new User();
		pp.prime();
		pp.palindrome();

	}

}
