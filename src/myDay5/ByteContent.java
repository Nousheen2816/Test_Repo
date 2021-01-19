//Define sample string content, convert to bytes and write byte content to a file in java


package myDay5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class ByteContent {
	 public static void main(String[] args) {
         
	        OutputStream opStream = null;
	        try {
	            String strContent = "Hi,I'm  writing byte content to a file";
	            byte[] byteContent = strContent.getBytes();
	            File myFile = new File("C:/Sprint1/emp.txt");
	            if (!myFile.exists()) 
	            {
	                myFile.createNewFile();
	            }
	            opStream = new FileOutputStream(myFile);
	            opStream.write(byteContent);
	            opStream.flush();
	        } 
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        } 
	        finally{
	           System.out.println("Contents are written to file");
	        }
}}
