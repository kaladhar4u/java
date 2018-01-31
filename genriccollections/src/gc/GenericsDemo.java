package gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenericsDemo {

	
	public static void main(String[] args) {
		List<String> arr=new ArrayList<String>();
arr.add("ere");
arr.add("ee");
arr.add("5");

Set<String> set = new HashSet<String>();
set.add("3");
set.add("kala");

HashMap<String, String> map = new HashMap<String, String>();
map.put("kala", "dhar");
map.put("kar", "dhar");
for(int i=0;i<arr.size();i++){
	 String s = arr.get(i);
	 System.out.println(s);
}
Iterator<String> it= set.iterator();
while(it.hasNext()){
	 String n= it.next();
	 System.out.println(n);
	
}
Set<String> keys= map.keySet();
Iterator<String> ite= keys.iterator();
while(ite.hasNext()){
	String ne= ite.next();
	System.out.println(ne);
}

	}

}
