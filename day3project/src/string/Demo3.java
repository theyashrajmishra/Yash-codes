package string;

public class Demo3 {
public static void main(String[] args) {
	String s = "ramlal";
	
	for (int i = 0; i<s.length(); i++) {
		String t = "";
		for (int j = 0; j<s.length(); j++){
			t= t+s.charAt(j);
			System.out.println(t);
		}
	}
}
}
