package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputStreamEx
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("F:\\\\JAVA\\\\test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(file));
		String line;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
	}
}  