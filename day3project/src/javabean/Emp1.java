package javabean;

public class Emp1 {
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setEmpId(12);
	
	int idd = e1.getEmpId();
	System.out.println(idd);
	Employee e2 = new Employee(2323, "yash" , "indore");
	System.out.println(e2);
}
}

