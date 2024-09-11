package sep9th;

public class PersonDemo {

	public static void main(String[] args) {
		
		System.out.println("Hi ..");
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		
		
		p1.name="Sivamani";
		
		p1.age=35;
		
		p1.phone=9848022338L;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		
		
		Person p2=new Person();
		p2.name="DJ Tillu";
		p2.age=30;
		p2.phone=9609333222L;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.phone);
		
		System.out.println("End of program..");

	}

}
