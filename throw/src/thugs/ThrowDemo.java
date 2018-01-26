package thugs;

public class ThrowDemo {

	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
		int c=a/b;
		}
		catch(Exception e){         
			System.out.println("hi");
			throw e; ///throw is used to re-throw the Exception and also to intentionally throw the exception 
		}
		

	}

}
