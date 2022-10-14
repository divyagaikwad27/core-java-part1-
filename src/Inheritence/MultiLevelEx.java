package Inheritence;

//Parent Class
class Car
{
	public Car()
	{
		System.out.println("Class Car");
	}

	public void vehicleType()
	{
		System.out.println("Vehicle Type : FourWheeler");
	}
}

//Child Class 
class Thar extends Car
{
	public Thar()
	{
		System.out.println("Class : Thar");
	}

	public void Brand()
	{
		System.out.println("  Brand : Thar");
	}
	public void Speed()
	{
		System.out.println("Max : 120 kmph");
	}
}

public class MultiLevelEx extends Thar
{
	
	public MultiLevelEx()
	{
		System.out.println(" Thar Model : 800 ");
	}
	public void Speed()
	{
		System.out.println("Max : 120 kmph");
	}

	public static void main(String[] args)
	{

		MultiLevelEx obj = new MultiLevelEx();
		obj.vehicleType();
		obj.Brand();
		obj.Speed();
				
	}

}
