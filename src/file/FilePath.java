package file;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePath
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("H:/JAVApdf/PG_Module 6_Core Java");
		
			if (f.createNewFile())
			{
				System.out.println("File is Created");
				
			}
			else
			{
				System.out.println("File already exist ");
			}	
			Path p = Paths.get("H:/JAVApdf/PG_Module 6_Core Java");
			boolean status;
			status=Files.isReadable(p);
			System.out.println("File is Readable?" +status);
			String path = f.getAbsolutePath();
			System.out.println("Absolute path :" +path);
			
			String path1 = f.getPath();
			System.out.println(" path : " +path1);
			
			String path2 = f.getCanonicalPath();
			System.out.println("Canonical path : " +path2);
			
	}



}
