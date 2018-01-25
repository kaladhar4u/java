package com.mypackage;

public class G2 {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		try{
		a[3]=4;
		int b=10/0;
	}
		catch(Exception d){      //Exception is a generic statement handle  all the exceptions
			System.out.println("Inside Catch block" );
		}
		System.out.println("after" );
	
		}
}


