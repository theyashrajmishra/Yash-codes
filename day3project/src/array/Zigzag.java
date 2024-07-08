package array;

public class Zigzag {
public static void main(String[] args) {
	 int [][] mat = {
			 {1,2,3,4,5},
			 {6,7,8,9,10},
			 {1,2,3,4,5},
			 {6,7,8,9,10}
	 };//5,4,3,2,1,6,7,8,9,10,5,4,3,2,1,6,7,8,9,10,
	 int i;
	for (int = 0; i<mat.length; i++ ) {
		 if (1%2 == 0) {
			 for (int j = mat[0].length-1; j>=0; j--) {
				 System.out.println(mat[i][j]+" ");
			 }
		 }else {
			 
		 }
	 }
	 }
}
