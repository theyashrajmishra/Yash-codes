package statickeyword;

public class Vehicle {
	static class car{
		String type;
	}
	
	class bike{
		int cc = 250;
	}
int tyre ;
int colour;
void run () {
	System.out.println("veh is running");
}
public static void main(String[] args) {
	Vehicle v1 = new Vehicle ();
	v1.tyre = 6;
	System.out.println(v1.tyre);
	
}
}
