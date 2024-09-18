package sep18th;

public class Two extends One {
	
	int a;
	
	public void putA(int a)
	{
		this.a=a;
	}
	
	public void showAll()
	{
		System.out.println("a is "+super.a);
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		super.greet();
	}
	
	public void greet()
	{
		System.out.println("Hey......bro..whazaap ???");
	}

}
