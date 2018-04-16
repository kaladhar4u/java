import java.util.ArrayList;
import java.util.List;
public class StringsCount{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("kaladhar");
	names.add("Negan");
	names.add("Aditya");
	names.add("lorhan");
	// Before Java 8
//	int count = 0;
//	for (String str : names) {
//	   if (str.length() < 6)
//		count++; 
//	}
		
	//Using Stream and Lambda expression
	 count = names.stream().filter(str->str.length()<6).count();
	System.out.println("There are "+count+" strings with length less than 6");

   }  
}