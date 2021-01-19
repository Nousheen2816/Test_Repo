//Write a program where finally block will not execute.(reason-2)

package myDay4;

public class NoFinallyExec2 {
	public static void main(String args[]) {
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
    	int j=20/0;
        System.out.println("Hi,I'm a Finally block");//When there occurs an exception in finally block
    }
}	
}
