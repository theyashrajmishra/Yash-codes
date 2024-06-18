package thiskeyword;

public class Animal {
	
	void safety() {
		System.out.println("safety check ");
	}
	// this ko current  class ki method ko call karne k liye
	void eat() {
		System.out.println("eating something");
	}
	public static void main(String[] args) {
		Animal s= new Animal();
		s.safety();
		s.eat();
	}

}
