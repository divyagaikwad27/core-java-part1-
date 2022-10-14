package HybridInherEx;

interface Mother
	{
		public void Mother();
	}

interface Brother extends Mother
	{
		public void Brother();
	}

interface Sister extends Mother
	{
		public void Sister();
	}

public class Exercise28 implements Brother, Sister
{
	public void Mother()
	{
		System.out.println("Mother is Backbone of My Family !!! ");
	}

	public void Brother()
	{
		System.out.println("      My brother Is Good Cricket Player...");
	}

	public void Sister()
	{
		System.out.println("The Biggest Blessings In My Life Is To have Yelder Sister As My Dii !!! ");
	}
	
	public static void main(String[] args)
	{
	 
	Exercise28 obj= new Exercise28();
	 obj.Mother();
	 obj.Brother();
	 obj.Sister();
	}
}

