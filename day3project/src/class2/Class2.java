package class2;

public class Class2 {
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++)
		{
			
		
		for (int j=0; j<5; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
		int i=0;
		int count =0;
		int internalcount=0;
		for(i=1; i<=5; i++)
		{
			count++;
			for(int j=1; j<=5; j++)
			{
				internalcount++;
			}
			
		}
		System.out.println(count);
		System.out.println(internalcount);
		
		
		
		for (int k=1; k<=5; k++)
		{
			
		
		for (int j=1; j<=k; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
		
		int count1 = 1;
		for (int l=1; l<=5; l++)
		{
			
		
		for (int j=1; j<=l; j++)
		{
			System.out.print(count1+" ");
			count1++;
		}
		System.out.println();
		
	}
		for (int w=1; w<=4; w++)
		{
			if(w==1  || w==4)
			{
				for (int j=1; j<=4; j++)
				{
					System.out.print("* ");
				}
				
			}
			else 
			{
				for (int j=1; j<=4; j++)
				{
					if(j==1 || j==4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
					
				}
			}
			System.out.println();
		}
	}
	
	

}
