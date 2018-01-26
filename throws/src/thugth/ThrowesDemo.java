package thugth;

import java.io.IOException;
import java.io.InvalidObjectException;

public class ThrowesDemo {

	
	public static void main(String[] args)throws Exception  { //throws is used to tell Exception is not handled  and their will be a Exception thrown from this method 
		int[] arr=new int[2];
		arr[0]=10;
		arr[1]=15;
		
		try{
			arr[2]=15;
		}
		
		catch(Exception e){
			System.out.println(arr[0]);
			throw new x();
			}
		
			
		

	}

}
