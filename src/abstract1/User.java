package abstract1;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favorite chocalate");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Perk a1 = new Perk();
			a1.Chocalate();
			break;
		case 2: Fivestar a2 = new Fivestar();
			a2.Chocalate();
			break;
		case 3:
			DiaryMilk a3 = new DiaryMilk();
			a3.Chocalate();
			break;

		default:
			System.out.println("This chocalate is not available");
			break;
		}
	}

}
