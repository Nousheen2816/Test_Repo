// Write a program to convert byte array object to reader object

package myDay5;
import java.io.*;
public class ByteArrayToReader {
	 public static void main(String a[]){
         
	        String str = "Hiii,I'm an employee of nisum";
	        byte[] b = str.getBytes();
	        InputStream is = null;
	        BufferedReader br = null;
	        try {
	            is = new ByteArrayInputStream(b);
	            br = new BufferedReader(new InputStreamReader(is));
	            String temp = null;
	            while((temp = br.readLine()) != null)
	            {
	                System.out.println(temp);
	            }
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        } 
	        finally
	        {
	        	 System.out.println("Converted Byte array to reader");
	         }
	        }
	         
	    }

