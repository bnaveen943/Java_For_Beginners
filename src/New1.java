

public class New1 
{
	public static void main(String[] args) 
	{	
	    int unit=350;
	    double amount=0;
	    if (unit<=100) 
	    {
	    	amount=unit*1;
	    	System.out.println("For less than "+amount);
		}
	    else if (unit>=101 && unit<=200 ) 
	    {
		amount=(100*1)+((unit-100)*2.5);
		System.out.println("More than 100 "+amount);
		}
	    else if (unit>=201 && unit<=300) {
			amount=(100*1)+(100*2.5)+((unit-200)*3.5);
			System.out.println("Unit is greater than 200 "+amount);
		}
	    else if (unit>=301 && unit<=400) 
	    {
		amount=(100*1)+(100*2.5)+(100*3.5)+((unit-300)*4.5);
		System.out.println("unit is greater than 300 and "
				+ " "+amount);
		}
	    else
	    {
	    	System.out.println("enter unit is much more greater");
	    }
	    	
	}

}
