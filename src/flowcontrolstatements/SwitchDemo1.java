package flowcontrolstatements;

public class SwitchDemo1 {

	public static void main(String[] args) {

		char x = 'a';

		switch (x) {
		case 10:
			System.out.println("x is 10");
			break;
		case 20:
			System.out.println("x is 20");
			break;
		
		case 97: 
			System.out.println("x is a ");
			break;
		default:
			System.out.println("x is neither 10 nor 20");

		
		}

		System.out.println("end of program");
	}

}
