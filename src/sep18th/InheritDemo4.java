package sep18th;

public class InheritDemo4 {

	public static void main(String[] args) {
		
		//case 1 
		
		//A obj=new A();
		
		//case 2
		
		//B obj=new B();
		
		//case 3
		
		//B obj=new A();  ==> not valid 
		
		//case 4
		
		A obj=new B();
		
		System.out.println(obj.x);
		obj.m1();
		
		

	}

}
