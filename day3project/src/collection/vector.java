package collection;

import java.util.*;

public class vector {
public static void main(String[] args) {
	Vector<String> pp = new Vector();
	pp.add("Banana");
	pp.add("papaya");
	pp.add("guava");
	pp.add("apple");
	
	for (String o:pp){
	System.out.println(o);
	}
	
	
	
	Stack <String> st = new Stack<String> ();
	st.add("math");
	st.add("hindi");
	st.add("so.study");
	st.add("physics");
	st.pop();
	System.out.println(st.peek());
	st.pop();
	st.push(null);
	System.out.println(st);
}
}
