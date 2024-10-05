package basicPrograms;

import java.util.Scanner;

public class Progm15 {
	public static void main(String[] args) {
		Progm15 EveOdd = new Progm15();
		EveOdd.jagged();
	}

	public void EvenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a totalTestCases");
		int totalTestCases = sc.nextInt();
		System.out.println("Enter a eachTestCaseValue");
		int eachTestCaseValue = sc.nextInt();

		System.out.println("Main method array ");
		int[][] array_Main = new int[totalTestCases][eachTestCaseValue];
		for (int i = 0; i < array_Main.length; i++) {

			for (int j = 0; j < array_Main.length; j++) {

				array_Main[i][j] = sc.nextInt();
			}
		}
		int nEvenNumbers = 0;
		int nOddNumber = 0;

		for (int i = 0; i < array_Main.length; i++) {

			for (int j = 0; j < array_Main.length; j++) {
				if (array_Main[i][j] % 2 == 0) {
					nEvenNumbers++;
				} else {
					nOddNumber++;
				}
			}

		}
		System.out.println("Number of even number is: " + nEvenNumbers);
		System.out.println("Number of Odd numbers is: " + nOddNumber);
	}

	public void jagged() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the element ");
		int size = scanner.nextInt();
		int[][] array_Jagged = new int[size][];
		for (int i = 0; i < array_Jagged.length; i++) {
			array_Jagged[i] = new int[i + 1];
		}
		int count = 0;
		for (int i = 0; i < array_Jagged.length; i++) {
			try {
				for (int j = 0; j < array_Jagged.length; j++) {
					array_Jagged[i][j] = count++;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		for (int i = 0; i < array_Jagged.length; i++) {
			try {
				for (int j = 0; j < array_Jagged.length; j++) {
					System.out.print(array_Jagged[i][j] + " ");
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

}
