package ConstructorEx;

public class Example 

{
	 Example(int i, int j)
	 	{
	      System.out.print("parameterized constructor");
	    }
	   Example(int i, int j, int k)
	   {
	      System.out.print("parameterized constructor1");
	   }
	   public static void main(String args[]){
		   
	      Example obj = new Example(4,5,6);

}}


/*package ConstructorEx;

public class Example 

{
	 Example(int i, int j)
	 	{
	      System.out.print("parameterized constructor");
	    }
	   Example(int i, int j, int k)
	   {
	      System.out.print("parameterized constructor1");
	   }
	   public static void main(String args[]){
		   
	      Example obj = new Example(4,5);  //with two values it will print only two integers

											//if we give only one value it will not print or give error
}}*/