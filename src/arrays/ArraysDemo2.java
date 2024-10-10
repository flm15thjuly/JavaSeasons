package arrays;

import sep17th.Student;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		
		int[] a=new int[5];
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		a[0]=10;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=50;
		//a[5]=600;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int temp:a)
		{
			System.out.println(temp);
		}
		

	}

}
