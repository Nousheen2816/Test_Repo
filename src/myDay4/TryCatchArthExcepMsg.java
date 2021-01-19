//Write a Program to hand the arithmetic Exception by using custom message.

package myDay4;

public class TryCatchArthExcepMsg {
	public static void main(String args[]) {
		  int a = 4;
		  int b = 0;
		  try
		  {
		  int n = a / b;
		  } 
		  catch (ArithmeticException e)
		  {
		  System.out.println("There's an exception : "+e);
		  }
	}

}
