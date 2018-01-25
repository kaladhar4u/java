package com.mypackage;

public class G3 {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		try{
		a[3]=4;
		int b=10/0;
		
		}
		catch(ArithmeticException d){
			System.out.println("Inside Catch block" );
		}
		catch(ArrayIndexOutOfBoundsException c){
			System.out.println("Inside Catch block2" );
		
		}
		catch(Exception e){  //generic expression should be placed last   because unused catch blocks are not accepted 
			System.out.println("Inside Catch block3" );
		}
		System.out.println("after" );
	
		}

}

