package class2;

public class Pattern {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<5-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i =5 ;i>0 ;i--) {
			
			// this loop is responsible for column 
			for (int j=0 ;j<5 ;j++) {
			 
				if(j< i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			 
			}
			System.out.println();
		}
		
		
		
		
	}	
	
	
}

