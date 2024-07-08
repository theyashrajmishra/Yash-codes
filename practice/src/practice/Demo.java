package practice;

public class Demo {
public static void main(String[] args, Address add) {
	Student [] arr = new Student [5];
	Student s1 = new Student();
	s1.setId(12);
	s1.setName("harilal");
	s1.setAdd(add);
	arr[0] = s1;
	Student s2 = new Student(90 ,"ram" , new Address("surat" , "gj" , "22222" ));
	arr[1] = s2 ;
	
	Student  s22  = new Student(90  ,"Ram" , new Address("Surat", "Gj" ,"232323"));
			
			arr[2] = s22 ;
			
	Student  s3 = new Student(90  ,"Shishupal" , new Address("Surat", "Gj" ,"232323"));
		

	   // s3.setAdd();
			arr[3] = s3 ;
			
			
			
	Student  s4  = new Student(90  ,"Lakhan" , new Address("Surat", "Gj" ,"232323"));
			
//	     Address f  = s4.getAdd() ;
//	     f.setCity("Vadodra");
//	     s4.setAdd(f);

	   s4.getAdd().setCity("Vadodra");


			arr[4] = s4 ;
		
			
			
			
			for (Student ff : arr) {
				System.out.println(ff);
			}
			
			
			
					
}
}
