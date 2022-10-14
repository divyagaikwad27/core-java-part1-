package oops;

class Area
{
	//fields to calculate the area 
	int length;
	int breadth;
	//constructor to initialize the value
	Area(int length , int breadth)
	{
		this.length=length;
		this.breadth=breadth;	
	}
	// Method to calculate the area 
	public void getArea()
	{
		int Area = length*breadth;
		System.out.println("Area : " +Area);
	}
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// create object of area 
		//pass the values length and breadth
		Area rectangle = new Area(7,5);
		rectangle.getArea();
	}

}

