package conctructor;

public class Student {
	int rollnumber ;
	String name;
	String address;
	String Subject;
	public Student(int rollnumber, String name, String address, String subject) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;
		Subject = subject;
	}public Student() {};
	
	
	public void display() {
		System.out.println("roll number - "+this.rollnumber);
		System.out.println("name- "+this.name);
		System.out.println("address-  "+this.address);
		System.out.println("subject-  "+this.Subject);
	}
	
	
	

}
