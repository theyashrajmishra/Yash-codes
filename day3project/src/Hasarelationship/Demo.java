package Hasarelationship;

import javabean.Employee;

public class Demo {
 public static void main(String[] args) {
	Address add1 = new Address();
	add1.setCity("Bhopal");
	add1.setPincode("462046");
	add1.setState("Madhya pradesh");
	Employee e1 = new Employee();
	
	e1.setEmpId(12)  ;
	e1.setEmpName("vishal")  ;
	e1.setAddress(add1)  ;
	
	System.out.println("i am coming from line 21 "+e1.);
	System.out.println("i am coming from line 28 " +e1.getAddress());
	System.out.println(e1.getEmpId());
	System.out.println(e1.getAddress().getClass());
	System.out.println(e1);
	

	
	
	Employee e2   = new Employee() ;
	
	System.out.println(e2);
	
}
}
