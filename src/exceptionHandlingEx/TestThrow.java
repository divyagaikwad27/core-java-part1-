package exceptionHandlingEx;

public class TestThrow
{

	//define method
		public static void checkNum(int num)
		{
			if(num<1)
			{
				throw new ArithmeticException("\nNumber is negative");
				
			}
			else
			{
				System.out.println("Square of : " +num+ " is " +(num*num));
			}
		}

		public static void main(String[] args)
		{
			
			TestThrow obj=new TestThrow();
			obj.checkNum(7);
			System.out.println("Rest of the code");
		}

}
