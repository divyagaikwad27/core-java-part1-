package thread;

class Table
{
	synchronized static void tab(int n)
	{
		for(int i=3;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = " +n*i);		
				try
				{
					Thread.sleep(400);
					
				}
				catch(Exception e)
				{
					
				}
		}

	}
}
class Three extends Thread
{  
	Table t;  
	Three(Table t)
	{  
		this.t=t;  
	}  
	synchronized  public void run()
	{  
		t.tab(3);    
	}    
}  
class Two extends Thread
{  
	Table t;  
	Two(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.tab(5);  
	}  
}


public class TableEx {
	public static void main(String ar[])
	{
		Table t=new Table();
		
		Three obj=new Three(t);
		obj.start();
		Two t2=new Two(t);
		t2.start();
		
		
	}

}
