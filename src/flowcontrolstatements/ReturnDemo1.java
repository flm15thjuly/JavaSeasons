package flowcontrolstatements;

import java.util.Scanner;

public class ReturnDemo1 {

	public static void main(String args[]) {
		
		System.out.println("Welcome to Selenium ..");
		
		Scanner input = new Scanner(System.in);
		String lang = input.next();
		
		if(lang.equals("java"))
		{
			System.out.println("You can enroll for Selenium + Java ");
			return;
		}
		else
		{
			System.out.println("sorry we teach only java ..");
			
		}
		
		System.out.println("End of program...");

	}

}
