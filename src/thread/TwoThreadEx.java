package thread;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("The Thread1 Count Will Be : " +i);
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for(int j=6; j<=10; j++)
		{
			System.out.println("The Thread2 Count Will Be : " +j);
		}
	}
}

public class TwoThreadEx
{
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		t1.start();
	
		Thread2 t2=new Thread2();
		t2.start();
	}

}
