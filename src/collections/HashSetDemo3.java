package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		Set hs=new HashSet();
		
		hs.add("FLM");
		hs.add("Java");
		hs.add("Python");
		hs.add("Devops");
		hs.add("Service now");
		hs.add(123);
		
		System.out.println(hs);
		
		//enhanced for loop
		for(Object temp:hs)
		{
			System.out.println(temp);
		}
		
		Iterator<Object> it=hs.iterator();
		
		Object temp=null;
		while(it.hasNext())
		{
			temp=it.next();
			System.out.println(temp);
		}
		
	  
		
		
	}

}
