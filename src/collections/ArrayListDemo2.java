package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> al=new ArrayList<Integer>();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);
		
		al.add(10);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);
		
		
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(int temp:al)
		{
			System.out.println(temp);
		}
		
		

	}

}
