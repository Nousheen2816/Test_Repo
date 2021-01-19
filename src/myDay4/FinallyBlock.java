//Write a program to execute the finally block.

package myDay4;

public class FinallyBlock {
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
	        }
	        finally 
	        {
	            System.out.println("Hi,I'm a Finally block");
	        }	       
	    }	
}
