package stringEx;

public class Compare1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="testing";
		String str2 ="TEST";
		
		//String str3="Testing";
		
		
		int h = str1.compareToIgnoreCase(str2);

		if (h==0)
		{
			System.out.println("Equals");	
		}
		else if( h > 0) 
		{
			System.out.println("String 1 is greater");		
		}
		else
		{		
			System.out.println("String 2 is greater");	
		}
		
		
		System.out.println(h==0?"Equals":(h>0?"String1":"String2"));
		
		
	}

}
