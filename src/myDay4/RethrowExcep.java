package myDay4;

public class RethrowExcep 
{
	public static void car() throws Exception 
	{
	     System.out.println("The Exception in car() method");
	     throw new Exception("thrown from car() method");
	}
	   public static void bus() throws Exception 
	   {
	      try 
	      {
	         car();
	      }
	      catch(Exception e) {
	         System.out.println("Inside bus() method");
	         throw e;
	      }
	   }
	   public static void main(String[] args) throws Throwable
	   {
	      try 
	      {
	         bus();
	      }
	      catch(Exception e)
	      {
	         System.out.println("Caught in main");
	      }
	   }

}
