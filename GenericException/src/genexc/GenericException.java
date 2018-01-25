package genexc;

public class GenericException {

	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
		int c=a/b;
		}
		catch(Exception e){         // generic exception is the parent class of all the exceptions
			System.out.println("hi");
		}
		
		

	}

}
