package sep3rd;

import java.util.Scanner;

public class MethodsDemo3 {
	


	public static void main(String[] args) {
		
		MethodsDemo3 obj1=new MethodsDemo3();
		
		//for Model 3
		int res1=obj1.natSum3();
		System.out.println(res1);
		
		//System.out.println(obj1.natSum3());
	
		// for Model 4
		
		int res2=obj1.natSum4(10);
		System.out.println(res2);

	}
	
	 //4) Methods with return-type and arguments/parameters	
	  int  natSum4(int n) {
		
		  int res=(n*(n+1))/2;
		  
		return res;
		  
		  
		
	}

	// 3) Methods with return-type and no  arguments/parameters

		 public  int natSum3() {
			
			 
			 Scanner input=new Scanner(System.in);
			 int n=input.nextInt();
			 
			 int res=(n*(n+1))/2;
			 
			 return res;
			  
			}


	
		 
		 
	
	
}
	
