package flowcontrolstatements;

import java.util.Scanner;

public class SwitchDemo2 {

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

		String mon = null;

		switch (month) {
		case 1:
			mon = "Jan";
			break;
		case 2:
			mon = "Feb";
			break;
		case 3:
			mon = "Mar";
			break;
		case 4:
			mon = "Apr";
			break;
		case 5:
			mon = "May";
			break;
		case 6:
			mon = "Jun";
			break;
		case 7:
			mon = "Jul";
			break;
		case 8:
			mon = "Aug";
			break;
		case 9:
			mon = "Sep";
			break;
		case 10:
			mon = "Oct";
			break;
		case 11:
			mon = "Nov";
			break;
		case 12:
			mon = "Dec";
			break;

		default:
			System.out.println("Invalid Month...");

		}

		System.out.println("Date of birth is " + date + "-" + mon + "-" + year);

		System.out.println("end of program");
	}

}
