package basicPrograms;

import java.util.Scanner;

public class Progm1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number: ");int num1=sc.nextInt();
		System.out.println("Enter second num: ");int num2=sc.nextInt();
		System.out.println("Enter a 3rd number: "); int num3=sc.nextInt();
		
		if((num1>num2) & (num1>num3) )
		{
			System.out.println("1st  number is greater "+ num1);
		}
		else if ((num2>num1) & (num2>num3))
		{
			System.out.println(num2 + " is greater number ");
		}
		else {
			System.out.println("3rd number is greater "+num3);
		}
		
		
	}

}
