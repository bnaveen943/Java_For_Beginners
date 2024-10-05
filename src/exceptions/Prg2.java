package exceptions;

public class Prg2 {
	public static void main(String[] args) {
		try {
			System.out.println("catch start");
			throw new ArithmeticException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
