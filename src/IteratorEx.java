import java.util.Iterator;

public class IteratorEx
{

	public static void main(String[] args)
	{
		Iterator<Integer> itr=IteratorEx.Iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }

	}

	private static Iterator<Integer> Iterator() 
	{
		
		return null;
	}
}
	
