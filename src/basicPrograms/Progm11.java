package basicPrograms;

import java.util.Scanner;

public class Progm11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of the array ");
		int size=sc.nextInt();
		System.out.println("Enter sthe string size");int size1=sc.nextInt();
		int arr[]=new int[size];
		String arr1[]=new String[size1];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Store the interger value");
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Strore string value ");
			arr1[i]=sc.nextLine();
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
