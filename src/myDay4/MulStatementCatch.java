//Write a program by with multiple exceptions handle in a single catch block.

package myDay4;

public class MulStatementCatch {
	public static void main(String[] args) {
		int x=20,y=0;
	    try {
	      int a[] = new int[10];
	      a[10] = x / y;
	    } 
	    catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
	    {
	      System.out.println("There's an exception : " + e.getMessage());
	    }
	  }

}
