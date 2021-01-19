// Write a program by implementing final,finally,finalize

package myDay4;

import myDay5.Employee;

final class Employee//final class
{
	  final int id=20;//final variable
	  final void run()//final method
	  {
		  System.out.println("Employee is working!!");
	  }
	  public void finalize()
		{
			System.out.println("Hi,I'm a finalize method");
		}
}

public class FinalFinalizeFinally
{
	 public static void main(String args[])
		  {
		 
		  Employee e=new  Employee();
		  System.out.println("Hi,I'm a final ");
		  System.out.println("Employee id: "+ e.id);
		  e.run();
		  int a=20,b=0;
		  try
		  {
			  int n=a/b;
		  }
		  catch(Exception ex)
		  {
			  System.out.println("There's an exception"+ex);
		  }
		  finally 
		  {
			  System.out.println("Hi,I'm a finally block");
		  }
		  	Employee f1=new Employee();  
			f1=null;   
			System.gc();  
}
}
