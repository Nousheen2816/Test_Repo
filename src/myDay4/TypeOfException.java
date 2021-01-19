//Write a program which represents difference between exception and runtime exception.

package myDay4;
import java.io.*;
public class TypeOfException {
	public static void main(String args[]) throws IOException, FileNotFoundException{
		FileInputStream f = null;
		try
		{
		   int arr[] ={1,2,3,4,5};
		   System.out.println(arr[7]);
		}
	        catch(ArrayIndexOutOfBoundsException e)
		{
		   System.out.println("Hi,I,m a unchecked exception " +"The specified index does not exist");
		}
		try{
		    f = new FileInputStream("c:/myJava.txt"); 
		}
		catch(FileNotFoundException fnfe){
	            System.out.println("Hi,I,m a checked exception " +" The specified file is not found");
		 }
		 int k; 

	      while(( k = f.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
		
		
		  f.close(); }

}
