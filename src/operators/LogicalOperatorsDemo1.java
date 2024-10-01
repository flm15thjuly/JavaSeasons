package operators;

import java.util.Scanner;

public class LogicalOperatorsDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		// System.out.println(x>=10 && x<=20);
		
		//System.out.println(x>=10 || x<=20);
		
		System.out.println(!(x>=10 || x<=20));
		
		

	}

}
