package statickeyword;

public class Staticblock {
static {
	System.out.println("main hu static block");
}
{
	System.out.println("instance block");
}
public static void main(String[] args) {
	
	System.out.println("main hoon main method");
	
	Staticblock a = new Staticblock();
}
}
