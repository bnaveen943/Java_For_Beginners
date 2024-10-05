package basicPrograms;

import java.util.Scanner;

public class Progm2 {
	public static void main(String[] args) {
		Progm2 a1=new Progm2();
		a1.num();
	}
	public void num() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1=sc.nextInt();
		if(num1>0)
		{
		if (num1%2 == 0)
		{
			System.out.println(num1+" is even number ");
		}
		else
		{
			System.out.println(num1+" is a odd number ");
		}
		}
		else
		{
			System.out.println(num1 + " is a negative number ");
		}
		
	}
}
