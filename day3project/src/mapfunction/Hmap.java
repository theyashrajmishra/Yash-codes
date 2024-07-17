package mapfunction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hmap {
public static void main(String[] args) {
	LinkedHashMap<String, String> country = new LinkedHashMap<>();
	country.put(" India ", " new delhi ");
	country.put(" france ", " paris ");
	country.put(" Japan ", " tokyo ");
	
	
	
	for(Map.Entry<String, String>m : country.entrySet()) {
		
		System.out.println(m);
	}
}
}
