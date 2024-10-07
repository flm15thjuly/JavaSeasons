package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo5 {

	public static void main(String[] args) {
	
			 
		Double sal=Double.parseDouble(args[1]);
		 
		 if(args[0].equals("non-it"))
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
		 else if(args[0].equals("it"))
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
