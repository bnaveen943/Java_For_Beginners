package abstract1;

public class Con2 extends Con1 {
	public Con2(int b)
	{
		super(10);
		System.out.println("Constructor 2 in implementation "+b);
	}
	public void m1()
	{
		
		System.out.println("Nonstatic bloclk");
	}
	public static void main(String[] args) {
		Con2 a2 = new Con2(25);
		a2.m1();
	}

}
