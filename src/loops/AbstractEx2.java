package loops;

abstract class Bird
	{
		// abstract method
		abstract void makeSound();
	}

	//Subclass (its inherit from abstract class which is Bird)		
	class Parrot extends Bird
	{
		//Regular method
		public void makeSound()
		{
			//birds sound which they makes 
			System.out.println("The sound that a Parrot makes : Mitthu Mitthu...."); 
		}
	}
	
	//Subclass (its inherit from abstract class which is Bird)
	class Peacock extends Bird 
	{
		//Regular method
		public void makeSound()
		{
			//birds sound which they makes 
			System.out.println("The sound that an Peacock makes: Myaoohh Myaoohh...");
	    }
	}
		
public class AbstractEx2 
{

	public static void main(String[] args)
	{
			// using local variable we create object
			Parrot obj = new Parrot();
			obj.makeSound();
			 
			Peacock obj1 = new Peacock();
			 obj1.makeSound();
		
	}

}
