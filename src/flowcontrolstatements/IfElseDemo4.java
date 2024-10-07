package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args) {

		System.out.println("Enter your date of birth details ");

		System.out.println("enter date");
		Scanner input1 = new Scanner(System.in);
		int date = input1.nextInt();

		System.out.println("enter month ..");
		Scanner input2 = new Scanner(System.in);
		int month = input2.nextInt();

		System.out.println("enter  year");
		Scanner input3 = new Scanner(System.in);
		int year = input3.nextInt();

		System.out.println(date + "-" + month + "-" + year);
		
		//3-10-2000
		//3-Oct-2000
		
		String mon=null;
		
		if(month==1)
		{
			mon="Jan";
		}
		else if(month==2)
		{
			mon="Feb";
		}
		
		else if(month==3)
		{
			mon="Mar";
		}
		else if(month==4)
		{
			mon="Apr";
		}
		
		else if(month==5)
		{
			mon="May";
		}
		else if(month==6)
		{
			mon="Jun";
		}
		
		else if(month==7)
		{
			mon="Jul";
		}
		else if(month==8)
		{
			mon="Aug";
		}
		
		else if(month==9)
		{
			mon="Sep";
		}
		else if(month==10)
		{
			mon="Oct";
		}
		
		else if(month==11)
		{
			mon="Nov";
		}
		else if(month==12)
		{
			mon="Dec";
		}
		else
		{
			System.out.println("Invalid Month ...");
		}
		
		System.out.println(date + "-" + mon + "-" + year);

	}

}
