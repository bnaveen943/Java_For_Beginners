package interface1;

import java.util.Scanner;

public class New1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int marks = sc.nextInt();
		m1(marks);
	}
	public static void m1(int marks)
	{
		if (marks>=81 && marks<=100) {
			System.out.println("Student got distinction");
		}
		else if (marks>=35 && marks<=80 ) {
			System.out.println("Students got first class");
		}
		else if (marks>=0 && marks<=34) {
			System.out.println("Students is failed");
		}
	}

}
