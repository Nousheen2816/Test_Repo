//Java Program to Allocate and Initialize Super Class Members Using Constructor

package myDay2;

public class SuperUsingConstructor {
	
	
	    public static void main(String args[])
	     {
	        Books n = new Books(10);
	     }

}
class Bag
	 {
	   Bag(int a, int b)
	     {
	         System.out.println("Hi,I'm a super class constructor");
	          int z = a + b;
	         System.out.println("Sum : "+z);
	     }
	 }
class Books extends Bag
		{
		    Books(int x)
		    {
		        super(12, 20);//super keyword can also be used to invoke the parent class constructor.
		        System.out.println("Hi,I'm a sub class constructor ");
		        System.out.println("Value of subclass constructor : "+x);
		    }
		}