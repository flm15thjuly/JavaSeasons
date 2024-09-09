package assignments;

import java.util.Scanner;

public class SimpleInterest0 {

	public static void main(String[] args) {
		SimpleInterest0 obj1=new SimpleInterest0();
		obj1.calc5();
		obj1.calc6(1000,12 , 2);
		obj1.calc7();
		obj1.calc8(2000, 24, 4);
		
		
		

	}
	//1)Methods with no return-type and no arguments/parameters
	public void calc5() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float p=input.nextFloat();
		System.out.println("Enter time period:");
		float t=input.nextFloat();
		System.out.println("Enter rate of Interest:");
		float r=input.nextFloat();
		float SI=(p*t*r)/100;
		System.out.println(SI); 
	}

	//2)Methods  no return-type with arguments/parameters
	public float calc6(float p,float t,float r) {
		float SI=(p*t*r)/100;
		System.out.println("Simple interest2:"+SI);
		return SI;
		
	}
	//3)Methods  with return-type no arguments/parameters
	public float calc7() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float p=input.nextFloat();
		System.out.println("Enter time period:");
		float t=input.nextFloat();
		System.out.println("Enter rate of Interest:");
		float r=input.nextFloat();
		float SI=(p*t*r)/100;
		System.out.println("Simple Interest3:"+SI);
		return SI;
		
	}
	//4)Methods with return-type and arguments/parameters
		public  float calc8(float p,float t,float r) {
			float SI=(p*t*r)/100;
			System.out.println("Simple Interest4:"+SI);
			return SI;
		}
}
