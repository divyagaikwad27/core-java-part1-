package oops;

	//Creating a parent class. 
	class Stationary
	{
		//defining a method 
		void run()
			{
				System.out.println("Stationary is Not Open");
			} 
	} 
		
	//Creating a child class 
	
	public class OverridingExample extends Stationary
	{
		void run()
			{
				System.out.println("Comic Book is available");
			}
		
	public static void main(String[] args)
	{	
		OverridingExample obj=new OverridingExample();    //creating object 
		obj.run();                						  //calling method		
	}
}
	
