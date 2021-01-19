//Write a program where finally block will not execute.(reason-1)

package myDay4;
public class NoFinallyExec1 {
	
	 public static void main(String args[])
	    { 
	       try
	        { 
	            int i = 10/0;
	            System.out.println("Hi,I'm a Try block");
	 
	        } 
	        catch (ArithmeticException e) 
	        { 
	            System.out.println("Hi,I'm a Catch block");
	            System.exit(0);
	        }
	        finally 
	        {
	            System.out.println("Hi,I'm a Finally block");//When we use System.exit() then program will automatically terminate and finally block will not get a chance to execute.
	        }	       
	    }	
}

