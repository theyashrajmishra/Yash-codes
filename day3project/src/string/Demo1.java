package string;



public class Demo1 {
public static void main(String[] args) {
	 String s = "welcome";
	 String s2 = "welcome";
	 String s3 = new String("welcome");
	 String s4 = new String("welcome"); 
	 
	 
	 
     System.out.println(s==s2);
     System.out.println(s==s3);
     System.out.println(s==s4);
     
     System.out.println(s.equals(s4));
     System.out.println(s.equals(s2));
     System.out.println(s3.equals(s4));
     
	 
}
}