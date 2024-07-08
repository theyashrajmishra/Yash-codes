package collection;

import java.util.*;

public class Demo {
public static void main(String[] args) {
	int [] arr = {12,44,21,61,9};
	arr[0] = 44;

	
	ArrayList<Integer>  arrayList = new ArrayList<Integer> ();
	
	arrayList.add(12);
	arrayList.add(121);
	arrayList.add(1212);
	arrayList.add(121211);
	arrayList.add(121112222);
	arrayList.add(1255555);
	arrayList.add(12);
	arrayList.add(12222);
	arrayList.add(1288888);
	arrayList.add(122888882);
	int len = arrayList.size();
	System.out.println(len);
	for (int i = 0;i<len; i++) {
		System.out.println(arrayList.get(i));
	}
	ArrayList<String> array = new ArrayList<> ();
	array.add("Roshan");
	array.add("Rakhi");
	array.add("Poonam");
	array.add(1,"Ram");
	for (int i=0;i<array.size();i++) {

	System.out.println(array.get(i));
	array.remove(0);
	
	
	
		
	}
}
}
