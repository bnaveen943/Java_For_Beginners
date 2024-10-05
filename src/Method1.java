
public class Method1 
{
	public static void main(String[] args) {
		sub(12,6);
		int j=add();
		System.out.println(j);
		boolean r=multi(12,12);
		System.out.println(r);
	}

	public static boolean multi(int i, int j) {
	boolean r=(i<=j);
	return r;
		
	}

	public static void sub(int i, int j) {
		int h=i-j;
		System.out.println(h);
		
	}

	public static int add() {
		int s=20,t=34;
		int j=s+t;
		return j;
		
	}
	

}
