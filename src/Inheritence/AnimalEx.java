package Inheritence;

public interface AnimalEx {
	
	class Animal  implements AnimalEx

	// class Animal AnimalEat,AnimalTravel
	{
	 
		public void eat()
		{
			System.out.println("Animal is eating");
		}
		public void travel()
		{
			System.out.println("Animal is travelling");
		}
	}

	public class MultipleInherEx {

		public static void main(String[] args) {
			Animal a=new Animal();
			a.eat();
			a.travel();

		}

	}

}
