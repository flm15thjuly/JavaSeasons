package exceptions;

import java.util.Scanner;

public class FinallyDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("Please enter non-zero value for y..Try again..");
		}
		catch(NullPointerException e)
		{
			System.out.println("Please don't enter null values ");
		}
		
		catch(RuntimeException e)
		{
			System.out.println("Runtime exception occured ..");
		}
		
		finally
		{
			System.out.println("entered into Finally block ...");
		}
		
		
		Thread.sleep(3000);
		
		System.out.println("End of Program..");
	
		

	}

}
