package Inheritence;

class Animal 
{ 
	public void CanNotTalk() 
	{ 
		System.out.println(" Animals Can not Talk Like Humans "); 
	}

} 
 
class Cat extends Animal 
{
	 public void CanNotTalk() 
	 { 
		 System.out.println("Cat Says : I can not Express My Feelings In Human Language "); 
	 } 
}

public class Talking {

	public static void main(String[] args) {

			Animal a = new Animal(); 
			 a.CanNotTalk(); 
			 a.CanNotTalk();
	}

}
