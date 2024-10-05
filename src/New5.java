
public class New5 
{
	public static void main(String[] args) 
	{
		int num=12,sum=0;
		for (int i = 1; i < num; i++) 
		{
			if (num%i==0) 
			{
				sum=sum+i;
			}
		}
		if (num==sum) 
		{
		 System.out.println("Enter number is perfect "+sum);	
		}
		else 
		{
           System.out.println("Enter number is not perfect "+sum);
		}
		m1();
	}

	public static void m1() {
		int num=121,sum=0,rem=0,temp=num;
		while (num!=0) 
		{
		 rem=num%10;
		 sum=(rem+sum*10);
		 num=num/10;
		}
		if (temp==sum) {
			System.out.println("Number is palindrom "+sum);
		} else {
        System.out.println("Number is not palindrome "+sum);
		}
		
	}

}
