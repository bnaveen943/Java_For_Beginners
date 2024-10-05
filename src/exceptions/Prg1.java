package exceptions;

public class Prg1 {
	public static void main(String[] args) {
		int x=1,y=0;
		try {
			System.out.println("Try block start ");
			int z=x/y;
			System.out.println("Value of z is "+z);
			System.out.println("Try block ends");
		} 
		catch (ArithmeticException e) {
			System.out.println("catch is start ");
			System.out.println(e.getMessage());
			System.out.println("Catch is ends");
		}
		catch(Exception a
				) {
			System.out.println(a.getMessage());
		}
	}

}
