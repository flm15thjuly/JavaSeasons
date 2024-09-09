package assignments;

import java.util.Scanner;


public class SimpleInterest {
	

	public static void main(String[] args) {
		SimpleInterest.calc1();
		SimpleInterest.calc2(10000, 10, 2);
		System.out.println(SimpleInterest.calc3());
		System.out.println(SimpleInterest.calc4(20000,18,5));

	}
	//1)Methods with no return-type and no arguments/parameters
	public static void calc1() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float p=input.nextFloat();
		System.out.println("Enter time period:");
		float t=input.nextFloat();
		System.out.println("Enter rate of Interest:");
		float r=input.nextFloat();
		float simpleIterest=(p*t*r)/100;
		System.out.println(simpleIterest);
	}
	//2)Methods with no return-type and with arguments/parameters
	public static void calc2(float p,float t,float r) {
		float simpleIterest=(p*t*r)/100;
		System.out.println("Simple interest:"+simpleIterest);
	}
	//3)Methods with return-type and without arguments/parameters
	public static float calc3() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float p=input.nextFloat();
		System.out.println("Enter time period:");
		float t=input.nextFloat();
		System.out.println("Enter rate of Interest:");
		float r=input.nextFloat();
		float simpleIterest=(p*t*r)/100;
		return simpleIterest;
	}
	//4)Methods with return-type and arguments/parameters
	public static float calc4(float p,float t,float r) {
		float simpleIterest=(p*t*r)/100;
		return simpleIterest;
	}	
}
