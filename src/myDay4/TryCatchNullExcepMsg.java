//Write a Program to hand the null pointer Exception by using custom message.

package myDay4;

public class TryCatchNullExcepMsg
{
	public static void main(String args[])
	{
	String str=null;
	try {
	  System.out.println("Length :"+str.length());
	}
	catch(NullPointerException e){

		  System.out.println("There's an exception : "+e);
	}

}
}
