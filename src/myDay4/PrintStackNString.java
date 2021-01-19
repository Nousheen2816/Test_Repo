//Write a Program to represent the different type of messages by using stackTrace(), toString().

package myDay4;

public class PrintStackNString {
	public static void main(String[] args) 
	{
		 try {
		          int a[]= new int[1];
		            a[5]=12;
		            
		} 
		 catch (Exception e)
		 {
			 System.out.println("Printing error message using PrintStackTrace ");
		   e.printStackTrace(); 
		   System.out.println("Printing error message using toString " + e.toString());
		            
		 }
		}


}
