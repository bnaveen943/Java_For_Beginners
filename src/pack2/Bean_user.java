package pack2;

public class Bean_user {
	public static void main(String[] args) {
		Java_Bean gese = new Java_Bean();
		System.out.println(gese.getPet());
		System.out.println(gese.getWild());
		System.out.println(gese.getClass());

		gese.setPet("cow");
		gese.setWild("Tiger");
		System.out.println(gese.getPet());
		System.out.println(gese.getWild());
		System.out.println(gese.toString());
	}
	/*
	 * Java bean is also Encapsulation Binding of data together is called
	 * encapsulation The process of wrapping class member and member function
	 * together to form a right unit
	 */
}
