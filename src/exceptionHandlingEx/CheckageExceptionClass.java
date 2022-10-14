package exceptionHandlingEx;

class UserDefinedAgeException  extends Exception
{
	String str;
	
	public String toString()
	{
		return this.str;	
	}
	
	UserDefinedAgeException(){}
	
	UserDefinedAgeException(String s)
	{
		this.str = s;
	}
	
	void checkAge(int a) throws UserDefinedAgeException
	{	
		String st;
		
		if((a>=1) && (a<=10))				
				st = "Kids...";	
		
		else if( a>=11 && a<=18 )
				st="Child...";
		
		else
				st="Valid Voter !";
		
		throw new UserDefinedAgeException(st);		
	}	
}

public class CheckageExceptionClass
{

	public static void main(String[] args)
	{
		UserDefinedAgeException obj=new UserDefinedAgeException();
		try
		{
			obj.checkAge(5);
		}
		
		catch(UserDefinedAgeException e)
		{
			System.out.println("here the human is classified into : " +e);
		}
		

	}

}

