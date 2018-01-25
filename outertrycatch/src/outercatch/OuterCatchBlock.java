package outercatch;

public class OuterCatchBlock {

	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
		try{
		int c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException e){         // generic exception is the parent class of all the exceptions
			System.out.println("hi");
			}
		}
		catch(ArithmeticException f){
			System.out.println("handled");
		}
		
	
		
	}
}

