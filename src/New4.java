
public class New4 
{
	public static void main(String[] args) 
	{
		fact();
		prime();
		int i=0;
	do {
		if(i%2==0)
			System.out.println("Even number are "+i);
		i++;
	} while (i<=25);
	}

	public static void fact() {
		int num=15;
		for (int i = 1; i <=num; i++) 
		{
		  if (num%i==0) 
		{
		 System.out.println("Factors of the number is "+i);	
		}	
		}
	}
	public static void prime()
	{
		int num=13,count=0;
		for (int i = 1; i <=13; i++) 
		{
	      if (num%i==0) {
			count++;
		} 
		}
		if (count==2) 
		{
		 System.out.println("Enter number is prime "+num);	
		} 
		else 
		{
           System.out.println("Enter number is not prime "+num);
  		}
	}

}
