package loops;

	 abstract class Animal
	 {
		 // abstract method
		 public abstract void animalSound();
		 
		 // Regular Method
		 public void sleep()
		 {
			 System.out.println("ZZZzzzz");
		 }
				 
	 }
	 //subclass (its inherit from abstract class which is Animal)
	 
class Monkey extends Animal
{
	public void animalSound() {	}
	{
		// the body of Animal Sound
		System.out.println("Monkey Says : hmm hmm");
	}
}
public class AbstractEx {

	public static void main(String[] args) {

		Monkey obj=new Monkey();
		obj.sleep();
				
	}

}
