package basicPrograms;

import java.util.Scanner;

public class Progm13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = { { 1, 3, 5 }, { 2, 4, 6 }, { 6, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
	}

}
