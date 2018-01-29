package hs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetDemo {

	
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("kala");
		set.add('k');
		set.add(2);
		int s = set.size();

	System.out.println(s);
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			if(o instanceof String){
		 String l=(String)o;
		 System.out.println(l);
			}
			else if(o instanceof Character){
				Character c= (Character) o;
				System.out.println(c);
			}
			else if(o instanceof Integer){
				 Integer i=(Integer)o;
				 System.out.println(i);
			}
			
				
			
				
			}
		
		

	}

}
