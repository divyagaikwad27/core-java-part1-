package variable;

public class localVar {
	
	public void StudentAge()
	{
		//local variable
		int age=0;
		age=age+20;
		System.out.println("Student Age is "+age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//local variable
		 localVar temp=new localVar(); //Constuctor 
		 temp.StudentAge();
	}

}
