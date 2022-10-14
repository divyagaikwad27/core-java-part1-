package oops;

public class OverloadingExample {

	/*
	 * function overloading is process where in function name and may be function return type will be same .
	 * list must be different 
	 * Syntax :
	 * 			void sum(int a, int b ){}
	 * 			void sum(float a,float b ){}
	 */
	
	void main()
	{
		System.out.println(" Void Main");
	}
	
	int main(int a ,int b)
	{
		System.out.println(" Int Main");
		return a+b;
	}
	
	String main(String a, String b)
	{
		System.out.println(" String Main ");	
	return a.concat(b);
	}
	
	float main(float a , float b, float c)
	{
		System.out.println("Float Main");
		return a+b+c;
	}
	
	int main(int a ,int b,int c)
	{
		System.out.println(" Int Main");
		return a*b*c;
	}
	
	public static void main(String... g)
	{

		OverloadingExample obj = new OverloadingExample();
		obj.main();
		
		System.out.println(obj.main(5, 7));
		System.out.println(obj.main("Good Afternoon " , "- Divya"));
		System.out.println(obj.main(7,2,9));
		System.out.println(obj.main(2.0f, 2.0f,3.0f));

	}

}
