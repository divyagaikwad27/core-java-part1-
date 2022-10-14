package Inheritence;


class Dog  implements AnimalEx

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
		Dog a=new Dog();
		a.eat();
		a.travel();

	}

}

