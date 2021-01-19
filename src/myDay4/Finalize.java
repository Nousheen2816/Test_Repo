//Write a Program by using finalize().

package myDay4;

public class Finalize 
{
	public void finalize()
	{
		System.out.println("Hi,I'm a finalize method");
	}  
	public static void main(String[] args)
	{  
	Finalize f1=new Finalize();  
	Finalize f2=new Finalize();  
	f1=null;  
	f2=null;  
	System.gc();  
	}}  


