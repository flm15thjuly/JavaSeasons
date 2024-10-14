package arrays;

public class Sum {
	
	public   Sum()
	{
		System.out.println("You have entered constructor ...");
	}
	
	public void add(int...  a)
	{
		int res=0;
		
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
	}
	public void add(double... a)
	{
		double res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
	}
	
	public void add(long x,long y)
	{
		System.out.println("Sum is "+(x+y));
	}

}
