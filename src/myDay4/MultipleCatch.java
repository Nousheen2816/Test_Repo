//Write a Program with Multiple Catch blocks.

package myDay4;

public class MultipleCatch {
	public static void main(String args[]) {
		  int a = 4;
		  int b = 0;
		  int arr[]=new int [5];
		  try
		  {
		  arr[5] = a / b;
		  }
		  catch (ArithmeticException e) {
			   System.out.println("Arithmetic Exception occured = " + e);
			 }
		  catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occured");  
          }  
       catch(Exception e)  
          {  
           System.out.println("Other Exception occured");  
          }             
	}
}
