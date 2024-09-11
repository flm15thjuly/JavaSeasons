package sep11th;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		System.out.println("Enter your pin");
		//System.out.println(c1.balance);
		Scanner input=new Scanner(System.in);
		int p=input.nextInt();
		c1.getBalance(p);

	}

}
