//Write a Program to hand the null pointer Exception by using try-catch block.

package myDay4;

public class TryCatchNullExcep 
{
		public static void main(String args[])
		{
		String str=null;
		try {
		  System.out.println("Length :"+str.length());
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		}
}
