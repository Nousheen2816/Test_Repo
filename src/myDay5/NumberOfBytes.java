//Java program to get (determine) the number of bytes written to a file using DataOutputStream

package myDay5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class NumberOfBytes {
	public static void main(String[] args){
		try
		{
			FileOutputStream f = new FileOutputStream("C:/Sprint1/emp.txt");
		    DataOutputStream d = new DataOutputStream(f);

		    d.writeBytes("I'm an employee of nisum company");
		    int bytesWritten =d.size();
		    System.out.println("Total bytes present in the entered string : "+bytesWritten);
		    d.close();			
		}
		catch(Exception ex)
		{
			System.out.println("Exception: " + ex.toString());
		}

	  }

}
