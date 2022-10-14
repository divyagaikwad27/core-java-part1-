package exceptionHandlingEx;

public class Exercise29
{	
		public static void main(String[] args)
		{
			try 
			{
				int[] numbers = {1, 2, 3};
				System.out.println(numbers[50]);
			}
			
			catch (Exception e) 
			{
				System.out.println("There is Some Error in the code.");
			}

		}
}
