package string;
import java.util.Arrays;
public class Reverse {
public static void main(String[] args) {
	String s = "sharma is a good player and he is so punctual ";
	
	
	String arr [] = s.split(" ");
	for (int j = arr.length-1; j>=0; j--) {
		System.out.print(arr[j]+" ");
	}
	System.out.println();
	for ( int i = 0 ;i<arr.length ;i++) {
    	String reverse  = "" ;
    	String word= arr[i];
    	for (int j  = word.length()-1 ; j>= 0  ;j--) {
    		reverse = reverse+ arr[i].charAt(j);
    	}
    	System.out.print(reverse+" ");
    }
}
}
