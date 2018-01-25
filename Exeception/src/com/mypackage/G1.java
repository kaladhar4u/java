package com.mypackage;

public class G1 {

	
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
		System.out.println("after" );
	
		}

}
