package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx 
{

	public static void main(String[] args)throws IOException
	{
		FileReader fr = new FileReader("F:\\JAVA\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
		br.close();
		fr.close();

	}

}
