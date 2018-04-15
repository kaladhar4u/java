package com.mypackage;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="addressjava")
public class Address {
	@Id
	@Column(name="addid")
	private int addressid;
	@Column(name="line1")
private int line1;
	@Column(name="line2")
private String line2;
	
	@ManyToMany
//	@JoinColumn(name="empid")
	List<Employee> employee;
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public int getLine1() {
		return line1;
	}
	public void setLine1(int line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}



}
