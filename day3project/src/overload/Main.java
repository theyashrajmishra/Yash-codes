package overload;

public class Main {
 public static void main(String[] args) {
	Bank b= new Bank();
	System.out.println("rate of bank  -  " + b.rate());
	
	
	
	SBI sb  = new SBI();
	System.out.println("rate of SBI  bank  -  " +sb.rate());
	
	
	Axis axis = new Axis();
	System.out.println("rate of  axis bank  -  " +axis.rate());
}
}
