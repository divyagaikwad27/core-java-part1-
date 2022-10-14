package StaticEx;

public class StaticDemo
{
	private static String str = "Divya";
	
		// Static class
	    static class Java
	    {	        
	        // non-static method
	        public void disp()
	        { 
	          System.out.println(str); 
	        }
	    }
	    
	    // static variable
	    static int a = m1();
	    
	    // static method
	    static int m1()
	    {
	        System.out.println("Java is a Platform Independent ");
	        return 27;
	    }
	      
	    // static method
	    public static void main(String[] args)
	    {
	       System.out.println("Value of a : "+a);     
	    }
	}

