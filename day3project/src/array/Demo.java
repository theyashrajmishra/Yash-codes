package array;

public class Demo {
public static void main(String[] args) {
	int[] arr = {23,27,64,75,83,24};// you have to present 83 is present
	boolean flg = false;
	for(int ssi : arr) {
		if(ssi == 3) {
			flg = true;
			System.out.println("yes");
		}
		
	}
	if(flg == false) {
		System.out.println("no");
	}
}
}