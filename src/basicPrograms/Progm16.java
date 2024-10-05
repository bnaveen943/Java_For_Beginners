package basicPrograms;

import java.util.Arrays;

public class Progm16 {
	public static void main(String[] args) {
		// iterating();
		// clones();
		// arrayCopy();
		// array_CopyOf();
		// copyOfRange();
		arrayOfToString();
	}

	public static void iterating() {
		/*
		 * COPY OF ARRAY ELEMENT BY ITERATING EACH ELEMENT OF GIVEN ORIGINAL ARRAY AND
		 * COPY ONE ELEMENT AT A TIME
		 */
		int[] arr = { 1, 2, 3 };
		int[] brr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		brr[2]++;
		System.out.println("Contents of arr[] ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n\n Contents of brr[] ");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	public static void clones() {
		/*
		 * Clone method
		 */
		int[] arr = { 4, 5, 6 };
		int[] brr = arr.clone();
		brr[0]++;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	public static void arrayCopy() {
		/*
		 * ArrayCopy() method
		 */
		int[] arr = { 1, 3, 5 };
		int[] brr = new int[arr.length];
		System.arraycopy(arr, 0, brr, 0, 3);
		brr[1]++;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}

	}

	public static void array_CopyOf() {
		int[] arr = { 1, 2, 3, 5 };
		int[] brr = Arrays.copyOf(arr, 4);
		brr[3]++;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	public static void copyOfRange() {
		int[] arr = { 1, 8, 9, 7, 11, 13, 4 };
		int[] brr = Arrays.copyOfRange(arr, 2, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < brr.length; i++) {
			System.out.print(+brr[i] + " ");
		}
	}

	public static void arrayOfToString() {
		boolean[] boolarr = new boolean[] { true, true, false, true };
		char[] charArr = new char[] { 'n', 'a', 'v', 'e', 'e', 'n' };
		double[] dblArr = new double[] { 1, 2, 3, 4, 5, 6 };
		Object[] obj = new Object[] { 1, 3, 5, 7, 9 };
		System.out.println("Boolean Array: " + Arrays.toString(boolarr));
		System.out.println("Characters Array: " + Arrays.toString(charArr));
		System.out.println("Double Arrays: " + Arrays.toString(dblArr));
		System.out.println("Object arrays is: " + Arrays.toString(obj));
	}

}
