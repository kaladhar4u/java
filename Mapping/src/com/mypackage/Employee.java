package com.mypackage;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employeejava")
public class Employee {
	@Id
	@Column(name="empid")
private int empid;
	@Column(name="empname")
private String empname;
	@Column(name="empsal")
private int empsal;
	
	@ManyToMany
//	(mappedBy="addressjava")
//@JoinTable(name="mappingtable", joinColumns=@JoinColumn(name="empid"),inverseJoinColumns=@JoinColumn(name="addreid"))
List <Address> address;
	
	
	
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpsal() {
	return empsal;
}
public void setEmpsal(int empsal) {
	this.empsal = empsal;
}


}
