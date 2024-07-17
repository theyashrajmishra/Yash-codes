package collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
public class Map {
public static void main(String[] args) {

		
		
		HashMap<String , Integer> mp  = new HashMap<>() ;
		
		mp.put("Virat" , 120  ) ;
		mp.put("Dhoni" , 130  ) ;
		mp.put("Suresh" , 110  ) ;
		
		mp.put("Rohit" , 150  ) ;
		
		mp.put(null , 1200  ) ;
		

		
		
		for(Entry<String, Integer> cc:mp.entrySet()) {
			System.out.println(cc.getKey()+"------"+ cc.getValue());
		}
		
		
		
}
}
