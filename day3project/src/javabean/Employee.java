package javabean;

import Hasarelationship.Address;

public class Employee {
private int  empId;
private String  empName;
private Address address;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(int empId, String empName, Address address )
{
	super();
	this.empId;
}
}

