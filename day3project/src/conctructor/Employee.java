package conctructor;

public class Employee {
	//you have to create a class Employee than some fields
	// empid , empName, empdept, empsal 
	// than you have to create constructor also both
	// than you have create a method like display 
	// like employee shift that is return string
	// then you have to give create 5 object of emp 
	// than assign them value with constructor 
	
	int Id ;
	String Name ;
	String department;
	double salary;
	public Employee(int id, String name, String department, int salary) {
		super();
		this.Id = id;
		this.Name = name;
		this.department = department;
		this.salary = salary;
	}
	public Employee () {};
	
	public void display() {
		System.out.println("Emp id  - "+this.Id);
		System.out.println("Emp name  - "+this.Name);
		System.out.println("Emp dept  - "+this.department);
		System.out.println("Emp salary  -  "+this.salary);
	}
	

}
