package statickeyword;

public class Student {
  
	
	String name ;
	String Subject ;
	
	static String collegeName = "ies" ;
	public static void learn() {
	  //	subject  = "hindi";// non static variables written
		System.out.println("all Student are learning");
	}
	
	
	public void study() {
		System.out.println("padh rahe h");
	}
	public static void main(String[] args) {
		
		Student.learn();
		Student s= new Student();
		s.name = "rajaji";
		s.Subject= "cs";
		
		
		s.study();
		
		// the static keyword in java used  for memory management only
		//the static keyword belongs to the class than  an instance of the class.
		System.out.println(s.name);
		System.out.println(s.Subject);
		System.out.println(s.collegeName);
				
		
		
		Student s2= new Student();
		s.name = "bhaiyaji";
		s.Subject= "me";
		
		
		System.out.println(s.name);
		System.out.println(s.Subject);
		System.out.println(s.collegeName);
		
		
	}
	
}


