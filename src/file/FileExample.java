package file;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("F:/JAVA/test.txt");
		
			if (f.createNewFile())
			{
				System.out.println("File is Created");
				
			}
			else
			{
				System.out.println("File already exist ");
			}	
			Path p = Paths.get("F:\\JAVA\\test.txt");
			boolean status;
			status=Files.isWritable (p);
			System.out.println("File is Writtable?" +status);
			
	}

}



/*   Same code But use try catch
package file;

import java.io.File;

import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File f=new File("F:/test.txt");
		try {
			if (f.createNewFile())
			{
				System.out.println("File is Created");
				
			}
			else
			{
				System.out.println("File already exist ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
*/
/*
 *   Same code But use try catch
package file;

import java.io.File;

import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f=new File("F:/test.txt");
		
			if (f.createNewFile())
			{
				System.out.println("File is Created");
				
			}
			else
			{
				System.out.println("File already exist ");
			}
		
		}

	}


 */
