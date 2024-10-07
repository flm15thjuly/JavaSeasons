package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
	
		System.out.println("enter your dept ..");
		 Scanner input2= new Scanner(System.in);
		 String dept=input2.next();
		 
		System.out.println("enter your salary ..");
		 Scanner input1= new Scanner(System.in);
		 double sal=input1.nextDouble();
		 
		 System.out.println(dept);
		 
		 
		 if(dept.equals("non-it"))
		 {
		 if(sal >0 && sal<=10000)
		 {
			 sal=sal+(sal*0.1);
		 }
		  else if (sal >10000 && sal<=20000)
		 {
			 sal=sal+(sal*0.2);
		 }
		 else if(sal >20000 && sal<=30000)
		 {
			 sal=sal+(sal*0.3);
		 }
		 else 
		 {
			 sal = sal +(sal*0.4);
		 }
		 
		
		 
		 }
		 else if(dept.equals("it"))
		 {
			 if(sal >0 && sal<=10000)
			 {
				 sal=sal+(sal*0.2);
			 }
			  else if (sal >10000 && sal<=20000)
			 {
				 sal=sal+(sal*0.3);
			 }
			 else if(sal >20000 && sal<=30000)
			 {
				 sal=sal+(sal*0.4);
			 }
			 else 
			 {
				 sal = sal +(sal*0.5);
			 }
			 
			
			 
		 }
			 
		 System.out.println("Net salary "+sal);
		 
	}

}
