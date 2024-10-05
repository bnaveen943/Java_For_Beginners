package basicPrograms;

import java.util.Scanner;

public class Progm3 {
	public static void main(String[] args) {
		Progm3 covid = new Progm3();
		covid.m1();
	}
	public void m1()
	{
		Scanner s=new Scanner(System.in);
		String fewer = null;
		String sym=s.next();
		int temp=s.nextInt();
		if (temp>100 & sym.equals(fewer))
		{
			System.out.println("Patient has covid positive with symptom");
		}
		else 
		{
			System.out.println("Covid negative");
		}
	}

}
