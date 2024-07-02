package practice;

public class Employee {
	 private String employeeId;
	    private String name;
	    private double salary;

	    public Employee(String employeeId, String name, double salary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.salary = salary;
}

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		 public String toString() {
		        return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: " + salary;
		    }
		}


