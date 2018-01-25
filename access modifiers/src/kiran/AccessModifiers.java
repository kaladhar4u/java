package kiran;

public class AccessModifiers { // can be accessed everywhere 
private int a ;// can be accessed only with in the class
protected int b;// can be accessed within the package and also other packages but it should be called with the subclass object in other packages

public static void main(String[] args){
	AccessModifiers obj=new AccessModifiers();
	Am1 obj1=new Am1();
	obj1.m3();
	
	obj.a=10;
	System.out.println("value is"+obj.a);
}
 public void m1(){
	System.out.println("inside m1");
}
  void m2(){ //can be accessed with in the package
	System.out.println("inside m2");
}
}
