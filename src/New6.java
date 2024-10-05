
public class New6 
{
	public static void main(String[] args) {
		int num=1221,sum=0,temp=num,rem=0;
		while (num!=0) 
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if (temp==sum) 
		{
		 System.out.println("Enter number is palindrome "+sum);	
		}
		else 
		{
			System.out.println("Enter number is not palindrome "+sum);
		}
		m1();
		m2();
		swab();
		swab1();
	}

	public static void m2() 
	{
	int num=145,sum=0,rem=0,temp=num;
	while (num!=0) 
	{
		rem=num%10;
		int fact=1;
		for (int i = 1; i <=rem ; i++) {
			fact=fact*i;
		}
		num=num/10;
		sum=sum+fact;
	}
	if (temp==sum) 
	{
		System.out.println("Enter number is special "+sum);
		
	} 
	else 
	{
		System.out.println("Enter number is not special "+sum);
	}
	
	}

	public static void m1() 
	{
		int num=153,rem=0,sum=0,temp=num;
		while (num!=0) 
		{
		 rem=num%10;
		 sum=(rem*rem*rem)+sum;
		 num=num/10;
		}
		if (temp==sum) 
		{
			System.out.println("Enter number is amstrong "+sum);
		} 
		else 
		{
        System.out.println("Enter number is not amstrong "+sum);
		}
	}
	public static void swab()
	{
		int temp=0,a=10,b=20;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
	}
	public static void swab1()
	{
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
}
	