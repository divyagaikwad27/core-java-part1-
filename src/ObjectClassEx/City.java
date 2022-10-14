package ObjectClassEx;

public class City {

	//declaring class variable
		public String name;
		public long population;
		
		//defining the method of the class 
		public void display()
		{
			System.out.println("city name:"+name);
			System.out.println("population:"+population);

		}

		public static void main(String[] args) {

			//declaring the object of the class
			City metro1,metro2;
			
			//instantiate the object of the class using new keyword
			metro1=new City();
			metro2=new City();
			metro1.name="Banglore";
			metro1.population=235678;
			System.out.println("Details of metro city1:");
			metro1.display();
			//display the method 
			metro2.name="Mumbai";
			metro2.population=235688;
			System.out.println("Details of metro city2:");
			metro2.display();
			
			

	}

}
