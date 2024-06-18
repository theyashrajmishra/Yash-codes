package thiskeyword;

public class Employee {
   private String name;
    public void setName(String gg) {
    	this.name = gg;
    }
    private Employee (int salary) {
    	System.out.println("salary is transferred to employees account"+salary);
    }
    
    public Employee(int paisa , String id) {
    	this(paisa);
    	System.out.println("work has been done");
    }
}
