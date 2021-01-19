//Write a Program to handle the arithmetic Exception by using try catch block.

package myDay4;

public class TryCatchArthExcep {
	public static void main(String args[]) {
		  int a = 4;
		  int b = 0;
		  try
		  {
		  int n = a / b;
		  } 
		  catch (ArithmeticException e)
		  {
		  e.printStackTrace();
		  }
	}
}
