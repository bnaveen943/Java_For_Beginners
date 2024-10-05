package basicPrograms;

public class Program19 {
	public static void main(String[] args) {
		buffer1();
		buffer2();
		replace();
		gfg();

	}

	public static void buffer1() {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("\tman");
		System.out.println(sb);
	}

	public static void buffer2() {
		StringBuffer sb1 = new StringBuffer("Hello man");
		sb1.insert(9, "\tLet's go ");
		sb1.replace(0, 5, "Hey");
		sb1.delete(0, 4);
		System.out.println(sb1);
	}

	public static void replace() {
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.reverse();
		System.out.println(sb2);
		StringBuffer cat = new StringBuffer();
		System.out.println(cat.capacity());
		cat.append("Java is a my favourite language and if you practice it will be easy ");
		System.out.println(cat);
		System.out.println(cat.capacity());

	}

	public static void gfg() {
		StringBuffer gb = new StringBuffer("Total length of the string is you have to find that one ");
		gb.append("using length keyword ");
		System.out.println(gb);
		int p = gb.length();
		int s = gb.capacity();
		System.out.println("Length of this string is can be find using length keyword " + p);
		System.out.println("Capacity can be find using capacity in stringBuffer " + s);
	}
	public static void gf()
	{
		
	}
}
