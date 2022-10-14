package forloops;

public class Pattern {

	public static void main(String[] args) {
		/*  A  
		 *  AA
		 *  AAA
		 *  AAAA
		 *  AAAAA 
		 */
		int i,j;
		char ch= 'A';
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				
					System.out.print("A"+"\t");
				}
				System.out.println();

		}
	}

}
