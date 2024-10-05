package loose;

public class User {

	public static void main(String[] args) {
		LooseCoupling l1;
		int choice = 1;
		switch (choice) {
		case 1:
			l1 = new A();
			l1.subject();
			break;
		case 2:
			l1 = new B();
			l1.subject();
			break;

		default:System.out.println("Enter subject tution is not available");
			break;
		}
	}

}
