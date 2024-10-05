package basicPrograms;

import java.util.Scanner;

public class Progm5 {
	public static void main(String[] args) {
		Progm5 cal = new Progm5();
		cal.calculate();

	}

	public void calculate()
	{
		Scanner sc=new Scanner(System.in);
		char operator = sc.next().charAt(0);
		switch (operator) {
		case '+':System.out.println(2+3);
		         break;
		case '-':System.out.println(9-3);
	             break;
		default:System.out.println("Invalid input");
			break;
		}
	}

}
