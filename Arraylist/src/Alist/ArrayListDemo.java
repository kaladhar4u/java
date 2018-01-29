package Alist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
List list = new ArrayList();
     list.add("kala");
     list.add(3);
     for(int i=0;i<list.size();i++){
    	  Object o = list.get(i);
    	  if(o instanceof String){
    		 String s= (String) o;
    		 System.out.println(s);
    	  }
    		 else if(o instanceof Integer ){
    			 Integer k=(Integer) o;
    			 System.out.println(k);
    		 }
    	  
    	
    	 
     

		
	}
	}
		

	}


