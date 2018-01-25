package com;

public class h{

	h(){
		System.out.println("inside constructor");	
	}
	
	
	
		public static void main(String[] args) {
			h kdr=new h();
			kdr.m1();
			B2 kdr2=new B2();
			kdr2.m2();
		}
		void m1(){
				System.out.println("inside m1");
					}
	 }
	class B2{
		
		
		void m2(){
			System.out.println("inside m2");
			B3 kdr3=new B3();
			kdr3.m3();
							
		}			
		}
		class B3{
		  void m3(){
		System.out.println("inside m3");
								
							
			}
			
			


	 

	}

