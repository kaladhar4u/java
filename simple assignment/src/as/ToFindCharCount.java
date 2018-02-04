package as;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ToFindCharCount {

	
	public static void main(String[] args) {
		String s="abcaacdfdee";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		 for(int i=0;i<s.length();i++ ){
		Character key= s.charAt(i);
	Integer value = map.get(key);
	 if(value!=null){
		 value=value+1;
			 map.put(key,value) ;    
		}else{
			map.put(key, 1);
		}
	 }
	Set<Character> keys= map.keySet();
	Iterator<Character> it = keys.iterator();
while(it.hasNext()){
	Character n = it.next();
	Integer v= map.get(n);
	System.out.println( "key " +n+" count is" +"=" +v);
	
}
	}

}
