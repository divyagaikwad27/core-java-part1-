package loops;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter Value m");
		m=sc.nextInt();
		System.out.println("Enter Value n");
		n=sc.nextInt();
		for(j=m;j<=n;j++)
		{
			System.out.println("Table of "+j+ "\n");
			
			for(i=1;i<=10;i++)
			{
				System.out.print(j*i+ "\t");

			}
			System.out.println();
	
		}
		
	}

}
