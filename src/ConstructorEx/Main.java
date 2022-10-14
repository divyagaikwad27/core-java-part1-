package ConstructorEx;

public class Main {
	
	String studentName;
	int studentAge;
	//constructor
	Main( String name , int age )
	{
		studentName = name;
		studentAge= age;
		
	}
	void display()
	{
		System.out.println(studentName+ " " +studentAge);
	}
	public static void main(String[] args)
	{
		Main myObj = new Main(" Divya ", 25);
		myObj.display();
	}

}
