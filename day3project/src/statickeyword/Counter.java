package statickeyword;

public class Counter {
  static int count  ;
 public Counter () {
	 count++ ;
	 System.out.println(count);
	
 }
 public static void main(String[] args) {
	Counter c = new Counter();
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	Counter c3 = new Counter();
	Counter c4 = new Counter();
}
}
