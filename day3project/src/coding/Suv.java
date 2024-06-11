package coding;

public class Suv {
	
	public static void main(String[] args) {
		int a=12;
		int b=5;
		int c=a+b;
		System.out.println(c);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		System.out.println(++a);
		//++a ek se badti pre increment
		
		System.out.println(a++);
		//a++ post increment
		
		System.out.println(a);
		//pehle value badegi then  operation
		 // pehle value operation karegi then  value badegi 
		
		int pp = 77;
		pp += 2;
		//pp = pp+2
		System.out.println(pp);
		
		pp -= 3;
		System.out.println(pp);
		
		pp *=2;
		System.out.println(pp);
		
		pp /=2;
		System.out.println(pp);
		
		pp %=5;
		System.out.println(pp);
		
		if(pp ==1)
		{
			System.out.println("yes sahi hai ");
		}
		else
		{
			System.out.println("oh galat hai");
		}
		
		
		if(pp > 1)
		{
			System.out.println("yes sahi hai ");
		}
		else
		{
			System.out.println("oh galat hai");
		}
		
		
		if(pp < 1)
		{
			System.out.println("yes sahi hai ");
		}
		else
		{
			System.out.println("oh galat hai");
		}
		
		if(pp <= 1)
		{
			System.out.println("yes sahi hai ");
		}
		else
		{
			System.out.println("oh galat hai");
		}
		
		if(pp >= 1)
		{
			System.out.println("yes sahi hai ");
		}
		else
		{
			System.out.println("oh galat hai");
		}
		
		int s=12;
		int r=13;
		if (s>r)
		{
			System.out.println("yes s is greater");
		}
		else
		{
			System.out.println("s is less than r");
		}
		int sachinKiAge=24; // camel case
		String adhar ="966933806" ;
		if(sachinKiAge == 24 && adhar == "966933806")// and operator
		{
			System.out.println("both statement is right");
		}
		else
		{
			System.out.println("statement is incorrect");
		}
		if(sachinKiAge == 26 || adhar == "96633806")// or operator
		{
			System.out.println("both statement is right");
		}
		else
		{
			System.out.println("statement is incorrect");
		}
		// in or operator both the statement is right so we are enter in else
		
		System.out.println(5%3);
		
		
		int cc = 5;
		System.out.println(c++);
		
		int k=10;
		System.out.println(k); //10
		System.out.println(k++);//10 //post-increment => (print, increase)
		System.out.println(++k);//12
		System.out.println(k--);//12
		System.out.println(--k);//10
		System.out.println(k);//10

		
		
		
		
		
		
		
	
		
		
	}

}