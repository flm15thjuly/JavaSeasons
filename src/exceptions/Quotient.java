package exceptions;

import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		
		System.out.println("Enter Dividend : ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		
		System.out.println("Enter Divisor : ");
		int y=input.nextInt();
		try
		{
		int z=x/y;
		System.out.println("Quotient is "+z);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("Please enter non-zero value for y..Try again..");
		}
		
		
		System.out.println("End of Program..");
	

	}

}
