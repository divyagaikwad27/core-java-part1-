package forloops;

public class FactorialNum {

	public static void main(String[] args) {

		int num = 10;
		long factorial = 1;
		for( int i=1; i<= num; i++)
		{
			System.out.printf("\nFactorial of Number %d =%d", num,factorial);
			factorial*=i;
			
		}
		
	}

}
