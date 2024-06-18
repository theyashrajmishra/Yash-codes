package array;

public class Main {
	
	//public static int[] reverseKaro(int[] array) {
		////int []newArray = new int[array.length];
		//int count = 0;
		//for (int i = array.length)
	//}
public static void main(String[] args) {
	int[] arr = new int[5];//[0,0,0,0,0]
	System.out.println(arr.length);
	arr[0] = 46;
	arr[4] = 30;
	arr[1] = 13;
	arr[2] = 44;
	arr[3] = 12;
	
	
	int [] newArray = {46 , 33,44,45,30};
	
	
	for (int i=0; i<5; i++) {
		
		
		
		if (arr[i]<17) {
			System.out.println("you are passed by grace");
			arr[i] = arr[i]+5;
		}
		System.out.println(arr[i]);
	
		System.out.println(newArray[i]);
	}
}


int[]ttt = {34,23,3,53,21,6,2};
//int [] ra =reverseKarro(ttt);


}