package controlflow;

public class SwitchEx {

	public static void main(String[] args) {

		int a=4;
		
		//Switch expression
		switch(a)		
		{
		
		//case statements
		case 1: System.out.println("I am @ Home");
		break;
		case 2: System.out.println("I am @ Office");
		break;
		case 3: System.out.println("I am @ School");
		break;
		default: System.out.println("Not @ Home, @ Office,or @ School");
		
		}
	}

}
