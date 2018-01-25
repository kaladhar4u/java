package com;

public class h1 {
	h1(){
		System.out.println("inside constructor1");	
	}
	h1(int a, int b){
		System.out.println("inside constructor2");	
	}
	h1(int a,int b,int c ){
		System.out.println("inside constructor3");	
	}
	
	public static void main(String[] args) {
		h1 kala=new h1();
		kala.hello();
		
		h1 kala1=new h1(5,6);
		kala1.hello(5,6);
		h1 kala2=new h1(7,8,9);
		kala2.hello(7,8,6);
	}
	void hello(){
		System.out.println("inside method1");	
	}
	void hello(int a, int b){
		System.out.println("inside method2");	
	}
	void hello(int a,int b,int c ){
		System.out.println("inside method3");	
	}
	

}
