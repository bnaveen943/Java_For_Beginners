import java.util.Scanner;

public class Method2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=even(num);
		System.out.println("Enter number is odd "+num1);
		
	}

	public static int even(int num) 
	{
		if (num%2==0)
		{
		 System.out.println("Enter number is even "+num);	
		}
		 return num;
	
	}
}
