package collection;
import java.util.*;
public class Setinterface {
public static void main(String[] args) {
	HashSet<String> ss = new HashSet<String>();
	ss.add("shubham");
	ss.add("shubham");
	ss.add("shubham");
	ss.add("swati");
	ss.add("pooja");
	ss.add("yash");
	ss.add("null");
	ss.add("null");
	
	for(String hh:ss){
		System.out.println(hh);
	}
	
	LinkedHashSet<String >kk = new LinkedHashSet();
	kk.add("String");
	kk.add("yash");
	kk.add("yash");
	kk.add("map");
	kk.add("mobile");
	kk.add("null");
	kk.add("null");
	for (String hh:kk) {
		System.out.println(hh);
	}
	
	TreeSet<Integer> ll = new TreeSet<Integer> ();
	ll.add(12);
	ll.add(12);
	ll.add(12);
	ll.add(1234);
	ll.add(1247);

	
	
		System.out.println(ll);
	
}
}
