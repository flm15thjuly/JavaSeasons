package sep4th;

import java.util.Scanner;

public class MethodsDemo4 {
	
	public static void main(String[] args) {
		
		MethodsDemo4.natSum1();
		MethodsDemo4.natSum2(100);
		System.out.println(MethodsDemo4.natSum3());
		System.out.println(MethodsDemo4.natSum4(10));
	}
	
	//2) Methods no return-type and with arguments/parameters
	
	public static void natSum2(int n)
	{
		int res=(n*(n+1))/2;
		System.out.println(res);
	}
	//4) Methods with return-type and arguments/parameters	
	public static int natSum4(int n)
	{
		int res=(n*(n+1))/2;
		return res;
		
	}
	
	//1) Methods  no return type and no arguments/parameters
			public static void natSum1() {
				
				System.out.println("Enter a natural number ");
				Scanner input=new Scanner(System.in);
				int n=input.nextInt();
				int res=(n*(n+1))/2;
				System.out.println(res);
				
				
				
			}
			
		//3) Methods with return-type and no  arguments/parameters
			
			public static int natSum3()
			{
				System.out.println("Enter a natural number ");
				Scanner input=new Scanner(System.in);
				int n=input.nextInt();
				int res=(n*(n+1))/2;
				return res;
			}

}
