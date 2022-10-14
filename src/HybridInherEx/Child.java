package HybridInherEx;

class HumanBody
{
	public void dispayHuman()
	{
		System.out.println("Method Defined Inside HumanBody Class");
	}
}
interface Male 
{
	public void show();	
}
interface Female 
{
	public void show();	
}

public class Child extends HumanBody implements Male, Female
{

	public void show()
	{
		System.out.println("Implimentation of Show() method Defines in interface Male And Female ");
	}
	public void displayChild()
	{
		System.out.println("Method Defined Child Class");
	}
	public static void main(String[] args)
	{
		Child obj = new Child();
		System.out.println("Implimentation of Hybrid  inheritence in Java ");
		obj.show();
		obj.displayChild();
		
	}

}
