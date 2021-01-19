//Java Program to Check Whether a Static Method Can Access the Instance Variable

package myDay2;

public class StatMethInstVar {
	public String name;//Instance Variable
	 static void myMethod()
	    {
	        System.out.println("Hi,I'm a static method trying to access instance variable");
	        System.out.println("Name "+ name);
	    }
	 public static void main(String args[]) 
	  {
	      myMethod();
	  }

}
