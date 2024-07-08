package array;

public class Demo {
public static void main(String[] args) {
	int[] arr = {23,27,64,75,83,24};// you have to present 83 is present
	boolean flg = false;
	for(int ssi : arr) {
		if(ssi == 83) {
			flg = true;
			System.out.println("yes");
		}
		
	}
	if(flg == false) {
		System.out.println("no");
	}
	
	
	int []ppp  = {4,6,71,8,5,3,23};
	int k =13;
	for(int i = 0;i<ppp.length;i++) {
		for (int j=i+1; j<ppp.length;j++) {
			if((ppp[i] + ppp[j]) == k){
				System.out.println(ppp[i]+" " +ppp[j]);
				break;
			} 
		}
	}
}
}
