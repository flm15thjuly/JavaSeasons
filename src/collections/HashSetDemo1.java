package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set hs=new HashSet();
		
		System.out.println(hs.size());   // 0
		
		System.out.println(hs.add(10)); 
		
		hs.add("FLM");
		
		hs.add("Java");
		
		hs.add(20.33);
		
		hs.add(null);
		
		System.out.println(hs.size()); // 4
		
		System.out.println(hs);
		
		for(Object temp:hs)
		{
			System.out.println(temp);
		}
		
		System.out.println(hs.add(10)); 
		
		hs.add("FLM");
		
		hs.add("Java");
		
		hs.add(20.33);
		
		hs.add(null);
		
		System.out.println(hs.size());  //4

		System.out.println(hs);
	}

}
