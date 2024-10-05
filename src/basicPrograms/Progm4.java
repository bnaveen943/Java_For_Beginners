package basicPrograms;

import java.util.Scanner;

public class Progm4 {
	public static void main(String[] args) {
    Progm4 a1=new Progm4();
    a1.atm();
	}
	public void atm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome enter your atm pin "); int pin=sc.nextInt();
		System.out.println("Enter a amount "); double amount=sc.nextDouble();
		System.out.println("Withdraw amount"); double withdraw=sc.nextDouble();
		double balance=0;
		if (pin==9712) {
			
			if(withdraw<=amount) {
				balance = amount-withdraw;
				System.out.println("collect your cash "+ withdraw +" your balance is "+balance);
			}
			else {
				System.out.println("Your withdraw amount is greater than the balance, please enter valid amount");
			}
			
		} else {
			System.out.println("you enter a wrong pin try again once");

		}
	}

}
