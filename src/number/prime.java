package number;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		int p,a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		p = sc.nextInt(); 

		/*for(a=2 ;  a < p  ;a++)
		{
			if ( p % a == 0 )
				break;
		}*/
		
		a=2;
		while( a  < p )
		{			
			if ( p % a == 0 )
				break;
			a++;
		}
		
							
		if( a == p )
			System.out.println("Prime");
		else
			System.out.println("Composite");
						
		
	}

}
