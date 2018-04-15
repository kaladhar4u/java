package com.mypackage;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateJava {
public static void main(String[] args) {
	Configuration cf = new Configuration();
	cf.configure();
	SessionFactory sf = cf.buildSessionFactory();
	Session ses = sf.openSession();
	Transaction tran = ses.beginTransaction();
	List<Address> list=new ArrayList<Address>();
	List<Employee> al = new ArrayList<Employee>();
	Employee emp = new Employee();
	emp.setEmpid(20);
	emp.setEmpname("dhar");
	emp.setEmpsal(20);
	Employee emp1 = new Employee();
	emp1.setEmpid(21);
	emp1.setEmpname("dhar");
	emp1.setEmpsal(20);	
	Address addr = new Address();
	addr.setAddressid(06);
	addr.setLine1(29);
	addr.setLine2("nj");
	Address addr1 = new Address();
	addr1.setAddressid(02);
	addr1.setLine1(28);
	addr1.setLine2("ny");

list.add(addr1);
list.add(addr);
al.add(emp1);
al.add(emp);
emp1.setAddress(list);
emp.setAddress(list);
	
	addr1.setEmployee(al);
	addr.setEmployee(al);
	ses.save(emp);
	ses.save(emp1);
	ses.save(addr1);
    ses.save(addr);
	
	
	


	tran.commit();
	ses.close();
	sf.close();
	
	
}
}
