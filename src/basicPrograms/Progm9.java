package basicPrograms;

import java.util.Scanner;

public class Progm9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Student[] students = new Student[size];
		for (int i = 0; i < students.length; i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			char c=sc.next().charAt(0);
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student roolNo "+students[i].rollNo+"name"+students[i].name+"Class of students"+students[i].standard);
		}

	}

}

class Student {
	public int rollNo;
	public String name;
	public char standard;

	public Student(String name, char standard, int rollNo) {
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}
}
