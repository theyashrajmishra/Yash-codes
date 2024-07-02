package practice;

public class Staff extends Employee{
private String jobTitle;

public Staff(String employeeId, String name, double salary) {
		super(employeeId, name, salary);
		 this.jobTitle = jobTitle;
		// TODO Auto-generated constructor stub
	}

public String getJobTitle() {
	return jobTitle;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

public void displayDetails() {
	// TODO Auto-generated method stub
	
}
}
