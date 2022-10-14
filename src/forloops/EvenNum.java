package forloops;

import java.util.*;

public class EvenNum {

	public static void main(String[] args) {

		int i,j,N,sum=0;
	       System.out.println("Enter The Value Of N");
	       Scanner sc=new Scanner(System.in);
	       N=sc.nextInt();

	       for(i=2;i<N;i+=2)
			sum+=i;
	       System.out.println("The Sum Of N Even Numbers: "+sum);
	    
	}

}
