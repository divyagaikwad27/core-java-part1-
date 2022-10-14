package Inheritence;

	interface CookingDishes 
	{ 
		public void print_CookingDishes();
	} 

	interface Playing
	{ 
		public void print_Playing(); 
	} 

	interface Singing extends CookingDishes, Playing
	{ 
		public void print_Singing();
	}

	class Hobbies implements Playing
	{
		public void print_Cooking() 
		{ 
			System.out.println("I Like To Cook New Dishes"); 
		} 
		
		public void print_Playing() 
		{ 
			System.out.println("I love To Play"); 
		} 

		public void print_Singing() 
		{ 
			System.out.println("Singing is my Passion");
		}
		
	}
	
public class Cooking 
{
	
	public static void main(String[] args)
	{
		Hobbies d = new Hobbies(); 
		d.print_Cooking(); 
		d.print_Playing();
		d.print_Singing();
	}

}
