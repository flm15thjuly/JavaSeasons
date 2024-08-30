package aug30th;

import java.util.Scanner;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		
		MethodsDemo2 obj1=new MethodsDemo2();
		
		System.out.println("1) Methods  no return type and no arguments/parameters");
		obj1.natSum1();
		//obj1.natSum1();
		//obj1.natSum1();
		
		System.out.println("2) Methods no return-type and with arguments/parameters");
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		obj1.natSum2(n);
		

	}
	
	public void natSum1()
	{
		System.out.println("Enter a natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res=(n*(n+1))/2;
		System.out.println(res);
	}
	
	public void natSum2(int n)
	{
		int res=(n*(n+1))/2;
		System.out.println(res);
	}

}
