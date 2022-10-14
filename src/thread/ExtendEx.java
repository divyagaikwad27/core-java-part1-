package thread;


class extendingThread extends Thread
{
	public void run()
	{
		System.out.println("Extending Thread class , Thread Started Running ..");
	}
}
public class ExtendEx 
{
	public static void main(String[] args)
	{
		extendingThread t1 =new extendingThread();		
		t1.start();
	}

}




