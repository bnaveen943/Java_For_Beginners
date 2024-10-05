package basicPrograms;

public class Progm19 {
	public static void main(String[] args) throws Exception {
		builder();
	}
	public static void builder()
	{
		StringBuilder str = new StringBuilder();
		str.append("Hello");
		System.out.println("String "+ str.toString());
		
		StringBuilder str1 = new StringBuilder("Hello gentle man");
		System.out.println("String1 "+str1.toString());
		
		StringBuilder str2 = new StringBuilder(35);
		System.out.println("String2 capacity "+str2.capacity());
		
		StringBuilder str3 = new StringBuilder(str1.toString());
		System.out.println("String3 = "+str3.toString());
		
	}

}
