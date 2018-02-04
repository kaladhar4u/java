package imstr;

public class ImmutableDemo {

	
	public static void main(String[] args) {
		Employee emp=new Employee();
          emp.setEmpid(10);  // to say class as immutable we should not have any setter methods
           emp.setEmpname("kaladhar");
           emp.setSal(1000);
           System.out.println(emp.getSal());
           System.out.println(emp.getEmpid());
           System.out.println(emp.getEmpname());
	}
}
  class Employee{
		private int empid; // to say class as immutable instance variables should be declared as private so that we cannot call by using object outside class
	private	String empname;
		private int sal;
		public int getEmpid() {
			return empid;
		}
//		public void setEmpid(int empid) {
//			this.empid = empid;
//		}
		public int getSal() {
			return sal;
		}
//		public void setSal(int sal) {
//			this.sal = sal;
//		}
		public String getEmpname() {
			return empname;
		}
//		public void setEmpname(String empname) {
//			this.empname = empname;
//		}
		
	}


