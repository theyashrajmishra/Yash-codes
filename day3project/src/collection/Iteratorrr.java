package collection;

import java.util.*;

public class Iteratorrr {
public static void main(String[] args) {
	 ArrayList<Integer> list = new ArrayList<>();

     int[] elementsToAdd = {5065, 3859, 44567, 5852, 601};
     for (int element : elementsToAdd) {
         list.add(element);
     }
     System.out.println("LL after adding elements: " + list);

     Iterator<Integer> iterator = list.iterator();

     while (iterator.hasNext()) {
         iterator.next();
         iterator.remove();
     }
     System.out.println(" LL after removing elements: " + list);
	
	
}
}
