package thiskeyword;

public class Bike {
 public Bike() {
	 
	 this(100);//it is a first statement 
	 // this must be first 
	 System.out.println("yes");
 }
 public Bike (int speed) {
	 System.out.println("100 ki speed"+speed);
 }
 public static void main(String[] args) {
	Bike ninja = new Bike(500);
}
}
// this ki help se constructor ko call kar sakte h
