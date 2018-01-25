package com.load;

public class A {

	
	public static void main(String[] args) {
		String a="5";
		String b="6";
		
		A obj=new A();
		obj.add(a,b);
	

	}
	int add(int a,int b){  // method overloading
		return a+b;
	}
	String add(String a,String b){
		return a+b;
	}

}
