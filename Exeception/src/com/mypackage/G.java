package com.mypackage;

public class G {

	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
		int c =a/b;//throw new ArithmeticException();JRE creates object to arithmetic expression and throw that exception 
		}
		catch(ArithmeticException d){
			System.out.println("Inside Catch block" );
		}
		System.out.println("after catch block");
		

	}

}
