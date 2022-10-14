package ConstructorEx;

public class NoArgument {
	int i;
	NoArgument()
	{
		i = 10;
		System.out.println("Creating a No argument Constructor");
		System.out.println("i = " + i);
		
	}

	public static void main(String[] args) {

		NoArgument Skill=new NoArgument();
	}

}
