package conctructor;

public class Cons2 {
	public static void main(String[] args) {

		
		Cons scorpio = new Cons();
		scorpio.brand = "mahindra";
		scorpio.tyre = 4;
		scorpio.modelname  = "s11";
		
		System.out.println(scorpio.giveHorn());
		System.out.println(scorpio.speed());
		System.out.println("full detils"+"brand-"+scorpio.brand + "model-"+ scorpio.modelname);
		
		
		Student s1 = new Student() ;
		s1.rollnumber = 125;
		s1.name = "yash";
		s1.Subject = "math";
		s1.address= "bhopal";
	
		s1.display();
	}

}
