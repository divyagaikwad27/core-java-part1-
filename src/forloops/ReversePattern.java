package forloops;

public class ReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  	A  
		 *     AA
		 *    AAA
		 *   AAAA
		 *  AAAAA 
		 */
		
		int i,j;
		char ch= 'A';
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=1;j--)
			{
				
				if(j<=i)
					System.out.print(ch+"\t");
				else
					System.out.print(" "+"\t");

				}
				System.out.println();

	}

}
}
