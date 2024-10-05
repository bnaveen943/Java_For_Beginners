package pack2;

public class Java_User {
	public static void main(String[] args) {
		Javabean s=new Javabean();
		System.out.println(s.getAcc_Name());
		System.out.println(s.getBank_Account_No());
		System.out.println(s.getAcc_Hold_Phno());
		System.out.println(s.getAmount_debit());
		
		s.setAcc_Name("Rak");
		s.setBank_Account_No(2345209455l);
		s.setAcc_Hold_Phno(8618991615l);
		s.setAmount_debit(20000);
		System.out.println(s.getAcc_Name());
		System.out.println(s.getBank_Account_No());
		System.out.println(s.getAcc_Hold_Phno());
		System.out.println(s.getAmount_debit());
		
		
	}

}
