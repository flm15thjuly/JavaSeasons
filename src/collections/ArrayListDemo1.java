package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40.44);
		
		al.add(50);
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		

	}

}
