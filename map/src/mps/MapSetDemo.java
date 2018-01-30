package mps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSetDemo {

	
	public static void main(String[] args) {
	Map map = new HashMap();
	map.put("kala", "dhar");
	map.put("james", "bond");
	map.put('k', 11);
	map.put("james", "bo");
	
	int s = map.size();
	System.out.println(s); //to know the size 
	Object o = map.get("kala");//to know the value of the keys when we know the keys
	String s1= (String)o;
	System.out.println(s1);
Set ks = map.keySet();      //to know the keyset we use
	System.out.println(ks);
	Iterator it = ks.iterator();
	while(it.hasNext()){
		Object n = it.next();
		if(n  instanceof String){
			String l=(String)n;
			String obj = (String)map.get(l);
			System.out.println(l);
			System.out.println(obj);
			
		}
		else if(n instanceof Character){

			Character c=(Character)n;
			Integer object = (Integer)map.get(c);			
		System.out.println(c);
			System.out.println(object);
		}
		}

	}

}
