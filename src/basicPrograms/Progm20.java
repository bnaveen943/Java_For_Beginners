package basicPrograms;

import java.util.Scanner;

public class Progm20 {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[5];
		int[] arr1 = store(arr);
		int[] arr2 = print(arr1);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static int[] store(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();

		}
		return arr;

	}

	public static int[] print(int[] arr1) {

		return arr1;

	}

}
