package com.ext;
class Human {

	
	public static void main(String[] args) {
		int ears;
		int nose;
		int eyes;
		Human obj2=new Human();
		obj2.hear();
		 Employee obj=new Employee();
		 obj.hear();
		 obj.hear1();
	}
		
		void hear(){
			System.out.println("hi");
		}
		void see(){
		}
		void smell(){
		}
		

}	


class Employee extends Human{
	int empId;
    String empname;
    int Sal;
   
void hear1(){
	System.out.println("hi1");
}
}



