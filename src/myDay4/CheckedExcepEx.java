//Write a Program for checked exception example

package myDay4;
import java.io.File;
import java.io.FileReader;
public class CheckedExcepEx
{
	
	public static void main(String args[])
	{		
	      File file = new File("C://Student.txt");
	      FileReader fr = new FileReader(file); 
	      fr.close();
	}
}
