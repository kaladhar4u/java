package com.mypackage;

public final class ImmutableDemo {   // class is final so we cannot extend it
ImmutableDemo(String name, int salary){
	this.name=name;
	this.salary=salary;
}

private final String name;
private final int  salary;
	
	public String getName() {
	return name;
}                   
	public int getSalary() {
		return salary;
	}
	//No setter 

	public static void main(String[] args) {
		ImmutableDemo id = new ImmutableDemo("kala",200);
System.out.println(id.name);

//id.setName("james");
//id.setSalary(500);
//System.out.println(id.name);
//System.out.println(id.salary);
//Their is no way to update name and salary after object is created 
	}

}

