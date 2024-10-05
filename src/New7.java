import java.util.Scanner;

public class New7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();sc.nextLine();
		int temp=num,rem=0,sum=0;
		while (num > 0) 
		{
			rem=num%10;
			num=num/10;
			sum=(sum*10)+rem;
		}
		
		if (temp==sum) 
		{
		 System.out.println("Enter number is palindrome "+sum);	
		} 
		else 
		{
          System.out.println("Enter number is not palindrome "+sum);
		}
	}

}
