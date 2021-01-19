//Java program to create a property file

package myDay5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


 public class CreatingPropertiesFile
 {
	   public static void main(String args[]) throws IOException 
	   {
	      Properties p = new Properties();
	      p.put("UserName : ", "Nousheen");
	      p.put("Password : ", "Hyderabad");
	      
	      String path = "D:\\myFile.properties";
	      FileOutputStream outputStrem = new FileOutputStream(path);
	      p.store(outputStrem, "This is first properties file");
	      System.out.println("Properties file is created.");
	   }
	}

