package file;

import java.io.BufferedReader;

import java.io.IOException;


import java.io.Reader;


public class BufferedReaderEx
	{ 
		public static void main(String[] args) throws IOException
		{ 
						
		
			BufferedReader br = new BufferedReader(new java.io.InputStreamReader (System.in));
			
			{
				System.out.print("Enter Your Name : ");
				String name1= br.readLine();
				
				System.out.print("Enter Your Age : ");
				int age1= Integer.parseInt(br.readLine());				
				
				System.out.print("Enter Your Percentage : ");
				float percentage1= Float.parseFloat(br.readLine());
				
				System.out.print("My Name is :  " +name1);
				System.out.print("  My Age is :  " +age1);
				System.out.print("  My Percentage is : " +percentage1);


			}
			
}

		private static Reader InputStreamReader() {
			// TODO Auto-generated method stub
			return null;
		} }

