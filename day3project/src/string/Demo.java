package string;

public class Demo {
public static void main(String[] args) {
	String s = "kiran ";
	System.out.println(s);
	
	// heap area is a memory of java
	
	String k = new String("sagar");
	s= s+ "singhanaiya";
	System.out.println(s);
	
	String a = "Rakesh";
	String b = "Rakesh";
	
	a = a+ " sharma";
b=	b.concat(" chauhan");
	
	System.out.println(a);
	System.out.println(b);
	
	char[]  arr =  {'a','y','u','s','h'};
	String u = new String(arr);
	System.out.println(u);
}
}
