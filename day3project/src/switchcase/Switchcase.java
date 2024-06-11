package switchcase;

public class Switchcase {
	public static void main(String[] args) {
		int day = 3;
	//	if (day ==4)
		//{
			//System.out.println("thursday");
		//}
		//else if(day == 1) 
		//{
			//System.out.println("monday");
		//}
		//else if(day == 2) 
		//{
			//System.out.println("tuesday");
		//}
		//else if(day == 3) 
		//{
			//System.out.println("wednesday");
		//}
		//else if(day == 5) 
		//{
			//System.out.println("friday");
		//}
		//else
		//{
			//System.out.println("chutti wala din hai");
		//}
		switch (day)
		{
		case 1 :
			System.out.println("monday");
			break;
		case 2 :
			System.out.println("tuesday");
			break;
		case 3 :
			System.out.println("wed");
			break;
		case 4 :
			System.out.println("thu");
			break;
		case 5 :
			System.out.println("fri");
			break;
			default:
				System.out.println("chutti");
		}
	}

}
