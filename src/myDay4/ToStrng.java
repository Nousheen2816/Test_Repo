//Write a Program to print the error message by using toString()

package myDay4;

public class ToStrng {
	public static void main(String[] args) 
	{
		 try {
		          int a[]= new int[1];
		            a[5]=12;
		            
		} 
		 catch (Exception e)
		 {
			 System.out.println("Printing error message using toString " + e.toString());
		 }
		}

}
