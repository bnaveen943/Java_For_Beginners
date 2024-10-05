package inheritance;

public class Pr4 extends Pr3 {
	String wild;
	public  Pr4(String wild)
	{
		super("Naveen");
		this.wild=wild;
		System.out.println("wild animal "+wild);
	}
}
