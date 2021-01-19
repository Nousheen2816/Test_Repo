//Write a Program with nested try block 

package myDay4;

public class NestedTry
{
	public static void main(String args[])
	{  
		int a=20,b=0;
		  try
		  {  
		    try
		    {  
		     System.out.println("Is division possible?  ");  
		     int n =a/b;  
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println("There's an exception "+ e);
		    }  
		  }	
		  finally
		  {
		System.out.println("Execution is handled");
		  }
	}

}
