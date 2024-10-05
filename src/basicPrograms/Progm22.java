package basicPrograms;

public class Progm22 {
	public static void main(String[] args) {
		Progm22 para = new Progm22("Rak",24);
		
	}
	String name;
	int id;
	double marks;
	long number;
	public Progm22(String a)
	{
		name=a;
		System.out.println(a);
	}
	public Progm22(String a, int b)
	{
		this("Naveen");
		name=a;
		id=b;
		System.out.println("Name of an employee "+ name +" and id number "+id);
	}
	
	
}


