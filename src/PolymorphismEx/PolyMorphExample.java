package PolymorphismEx;

class Polygon
{
	// Method to render a shape
	
	public void render()
	{
		System.out.println("Rendering Polygon...");
	}
}
class Square extends Polygon
{		

	//render square
	public void render()
	{
		System.out.println("Rendering Square...");
	}
}
class Circle extends Polygon
{
	//render square
	public void render()
	{
		System.out.println("Rendering Circle...");
	}
}

public class PolyMorphExample {

	public static void main(String[] args) {

		// Creating an object of a circle 
		// dynamic binding
		Circle c1 = new Circle();
		c1.render();
		
		// Creating an object of a Square 		
		Square s1 = new Square();
		s1.render();
		
		// Static binding
		Polygon p1 = new Polygon();
		p1.render();
		
	}

}
