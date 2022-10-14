package file;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.OutputStream;

public class StreamExample
{
	public static void main(String args[]) 
	{
		try 
		{
			OutputStream s = new FileOutputStream("F:\\JAVA\\test.txt");
			s.write(99);
			s.write(66);
			s.write(67);
			s.close();
			System.out.println("Successfully Created and Written the file.");
		} 
		catch (IOException e) 
		{
			System.out.print("Exception");
		}
	}
}

