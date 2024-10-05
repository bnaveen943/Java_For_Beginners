package exceptions;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		m1();
		
	}
	public static void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age of the candiate ");
		int age=sc.nextInt();
		System.out.println("Welcome for voting ");
		if (age>18) {
			System.out.println("Do vote for best candiate ");
		} else {
			try {
				throw new NotEligibleToVote();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getLocalizedMessage());
			}

		}
	}

}
