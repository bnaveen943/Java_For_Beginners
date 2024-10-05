package casting;

public class Wide_Narrow {
	public static void main(String[] args) {
		float c=1000;
		System.out.println("implicite widening "+c);
		double a =(double)100;
		System.out.println("Wideing "+a);
		int cat = (int)100.45;
		System.out.println("Narrowing only happens explicity "+cat);
		/*
		 * Here loss of data will happen in narrowing 
		 */
	}

}
