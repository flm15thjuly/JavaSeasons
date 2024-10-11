package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		hs.add("FLM");
		hs.add("Java");
		hs.add("Python");
		hs.add("Devops");
		hs.add("Service now");
		
		System.out.println(hs);
		
		//enhanced for loop
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		Iterator<String> it=hs.iterator();
		
		String temp=null;
		while(it.hasNext())
		{
			temp=it.next();
			System.out.println(temp);
		}
		
	  
		
		
	}

}
