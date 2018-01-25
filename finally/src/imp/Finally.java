package imp;

public class Finally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
		int c=a/b;                            //try block may be surrounded by one or more catch block or finally block
		}
		finally{
			System.out.println("executed");// we will write the code in the finally block that need to be executed even if the exception occurs
		}
		
	}

}
