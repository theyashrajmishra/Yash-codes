package conctructor;

public class Emp {
public static void main(String[] args) {
	Employee E1 = new Employee() ;
	E1.Id = 101;
	E1.Name = "Yashraj";
	E1.department = "management";
	E1.salary = 10001.00;
	
	Employee E2 = new Employee() ;
	E2.Id = 102;
	E2.Name = "soumya";
	E2.department = "Admin";
	E2.salary = 20002;
	System.out.println();
	E1.display();
	E2.display();
}
}
