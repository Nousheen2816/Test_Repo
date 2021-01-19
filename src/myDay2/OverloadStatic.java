//Write a program to overload static methods

package myDay2;

public class OverloadStatic {
	public static void hello(String name)
	{
		System.out.println("Hello,I'm " + name );
	}
	public static void hello(String name,int age)
	{
		System.out.println("Hello,I'm " + name +" My age is "+ age);
	}
	  public static void main(String[] args) 
	  {
		  hello("John");
		  hello("John",20);
		  
	  }

}
