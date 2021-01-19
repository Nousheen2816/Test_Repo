//Write a java program to store property file as xml file

package myDay5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class XMLFile {
	 public static void main(String a[]) throws IOException{
         
	        OutputStream os = null;
	        Properties prop = new Properties();
	        prop.setProperty("Name", "Nousheen Begum");
	        prop.setProperty("ID", "20");
	        prop.setProperty("Email", "nousheen2816@gmail.com");
	        try {
	            os = new FileOutputStream("Name.xml");
	            prop.storeToXML(os, "Hi,I'm a XML File");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	         
	    }
}
