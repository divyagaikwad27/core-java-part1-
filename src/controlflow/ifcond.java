package controlflow;

public class ifcond {

	public static void main(String[] args) {

		int marks=43;
		if(marks>= 60)
		{
			System.out.println("You passed with first grade");
		}
		else if(marks >=45 || marks < 60)
		{
			System.out.println("You passed with second grade.");
		}
		else if(marks >=33 || marks < 45)
		{
			System.out.println("You passed with third grade.");
		} 
		else 
		{
			System.out.println("Sorry, you are fail.");
		}
	}

}
