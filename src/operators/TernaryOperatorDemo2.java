package operators;

import java.util.Scanner;

public class TernaryOperatorDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Please some integer ");
		
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		System.out.println(x>=0?"+ve":"-ve");
	}

}
