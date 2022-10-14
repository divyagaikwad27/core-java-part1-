package thread;

public class MultiThreadingEx36 
{
	public static void main(String[] args) 
	{
		MultiThread thread1 = new MultiThread("Thread1");
		thread1.start();
		MultiThread thread2 = new MultiThread("Thread2");
		thread2.start();
	}
}
class MultiThread implements Runnable
	{
		Thread Playing;
		private String IoT;
		MultiThread(String name) 
		{
			IoT = name;
		}
			@Override
		public void run() 
			{
				System.out.println("Thread is running" + IoT);
				for (int i = 0; i < 4; i++) 
				{
					System.out.println(i);
					System.out.println(IoT);
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e)
					{
						System.out.println("Thread is interrupted");
					}
				}
			}
		public void start() 
		{
			System.out.println("Thread is started");
			if (Playing == null) 
			{
				Playing = new Thread(this, IoT);
				Playing.start();
			}


		}

	}
