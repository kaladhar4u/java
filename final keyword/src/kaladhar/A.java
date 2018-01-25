package kaladhar;
 

public  class A {//if we mention class as final we cannot extend it
	static int a = 10; //  static variable changes in the class level and can be called with class name
	final int b = 10;         //if we declare final we cannot change its value
	
	public static void main(String[] args) {
		
		A.a=20;
		                      
		A.a=30;
		System.out.println(A.a);

		System.out.println(A.a);
		

		
		
		B obj=new B();
		obj.m1();
		System.out.println("done");
		System.out.println(obj.b);
		
		

	}
	final void m1(){  //if we mention method as final we cannot override it
		System.out.println("final");
	}

}
