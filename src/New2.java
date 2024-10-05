
public class New2 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,sum=0;
		System.out.println(n1);
		System.out.println(n2);
		for (int i=0; i<=10; i++) 
		{
		 sum=n1+n2;
		 n1=n2;
		 n2=sum;
		 System.out.println(sum);
		}
		int fact=m1();
		System.out.println("factorial value is "+fact);
	}
	public static int m1()
	{
		int fact=1;
		for (int i = 1; i <= 5; i++) {
			fact=fact*i;
		}
		return fact;
	}

}
