package basicPrograms;

import java.util.Arrays;

public class Progm17 {
	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		int[] arr = { 1, 2, 3 };
		int[] brr = { 1, 2, 3 };
		if (Arrays.equals(arr, brr)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	}

}
