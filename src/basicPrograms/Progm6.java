package basicPrograms;

import java.util.Scanner;

public class Progm6 {
	public static void main(String[] args) {
		int fact1=fact();
		System.out.println(fact1);
	
	}

	public static int fact() {
		int fact = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");int num=sc.nextInt();
		int i=1;
		while (i<=num) {
		fact=fact*i;
		i++;
		}
		return fact;
		
	}
	

}
