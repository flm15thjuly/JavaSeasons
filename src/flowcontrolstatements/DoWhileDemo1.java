package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String uname=null;
		String pwd=null;
		
		do
		{
			System.out.println("Enter Username : ");
			uname=input.next();
			System.out.println("Enter Password : ");
			pwd=input.next();
			if(uname.equals("reyaz0607") && pwd.equals("reyaz123"))
			{
				System.out.println("Welcome to dashboard...");
				break;
			}
		} while(uname.equals("reyaz0607") && pwd.equals("reyaz123"));

		System.out.println("End of program..");
	}

}
