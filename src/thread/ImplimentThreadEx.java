package thread;

class RunnableThread implements Runnable
{
	public void run()
	{
		System.out.println("Implementing the Runnable Interface, Thread Started Running ..");
	}
}
public class ImplimentThreadEx 
{
	public static void main(String[] args)
	{
		RunnableThread t1 =new RunnableThread();
		Thread t2=new Thread(t1);
		t2.start();
	}

}
