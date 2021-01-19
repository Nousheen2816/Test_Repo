//Write a program which has multiple methods in a class and implementing in exception.


package myDay4;

public class MultipleMethodsExcep
{
	 public static void main(String[] args)
	 {
	        try
	        {
	            hello();
	        }
	        catch (ArithmeticException e){
	            System.out.println(e);
	        }
	    }

	    static void hello()
	    {
	        try
	        {
	        	
	            world();
	        }
	        catch (ArithmeticException e){
	            System.out.println("Arithmetic Exception occured");
	        }
	    }

	    static void world()
	    {
	        try
	        {
	        	int a = 20/0;
	        }
	        catch (NumberFormatException e)
	        {
	            System.out.println("Number format exception");
	        }
	    }

	  

}
