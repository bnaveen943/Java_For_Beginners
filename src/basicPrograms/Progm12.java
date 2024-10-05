package basicPrograms;

import java.util.Scanner;

public class Progm12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] students = new Animal[2];
		for (int i = 0; i < students.length; i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println("Animals details " + students[i].desort + " and " + students[i].forestAnim);
		}
	}
}

class Animal {
	public String forestAnim = "Elemenet";
	public String desort = "Camel";

	public Animal(String forestAnim, String desort) {
		this.forestAnim = forestAnim;
		this.desort = desort;
	}
}
