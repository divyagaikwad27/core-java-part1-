package exceptionHandlingEx;

public class tryCatchEx {

	public static void main(String[] args) {

		try
		{
			int array[] = {1,2,3,4,5};
			System.out.println(array[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something went Wrong ...");
		}
		finally
		{
			System.out.println("The 'Try' And 'Catch' finished.");	
		}
	}

}
