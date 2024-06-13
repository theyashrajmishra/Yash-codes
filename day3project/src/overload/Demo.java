package overload;

public class Demo {
	public static int add(int a, int b) {
		return a+b;
		
	}
	public static int add(int a,int b, int c) {
		return a+b+c;
	}
	public static void add() {
		System.out.println("kuch nahi aara h");
	}
	public static void main(String[] args) {
		int h= 12;
		int u= 89;
		int gg = 70;
		int c= add(h, u,  gg);
		System.out.println(c);
	}

}
