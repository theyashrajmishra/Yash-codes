package isarelationship;

public class Main {
public static void main(String[] args) {
	Appliance a= new Appliance( );
	a.setBrandName("voltas");
	a.setPrice(42000);
	System.out.println(a);
	Television t1 = new Television();
	t1.setBrandName("lg");
	System.out.println(t1);
	Television t2 = new Television(32, "45db");
	System.out.println(t2);
	Television t3 = new Television("samsung", 40000, 32, "40v");
System.out.println(t3);
}
}
