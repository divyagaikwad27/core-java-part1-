package exceptionHandlingEx;

public class JvaException {

	public static void main(String[] args) {

		try
		{
			//code that may raise exception 
			int data=50/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			//rest code of the program
		}
		System.out.println("Rest Of The Code");
	}

}
