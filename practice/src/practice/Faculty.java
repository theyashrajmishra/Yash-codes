package practice;

public class Faculty extends Employee {

	private Object department;

	public Faculty(String employeeId, String name, double salary) {
		super(employeeId, name, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}
	 public String getDepartment() {
	        return (String) department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Department: " + department;
	    }
		public void displayDetails() {
			// TODO Auto-generated method stub
			
		}

}
