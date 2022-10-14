package oops;

//Parent Class
class Bank
	{
		int getRatesOfInterest()
		{
			return 0;
		}
	}
		// creating child class
		class SBI extends Bank
		{
			int getRatesOfInterest()
			{
				return 7;
			}
		}
		class AXIS extends Bank
		{
			int getRatesOfInterest()
			{
				return 9;
			}
		}
		class BOI extends Bank
		{
			int getRatesOfInterest()
			{
				return 6;
			}
		}
		
	

public class OverridingEx {

	public static void main(String[] args) {

		SBI s= new SBI();
		AXIS a=new AXIS();
		BOI b= new BOI();
		
		System.out.println("SBI rate of interest is: " +s.getRatesOfInterest());
		
		System.out.println("AXIS rate of interest is: " +a.getRatesOfInterest());

		System.out.println("BOI rate of interest is: " +b.getRatesOfInterest());

	}

}

