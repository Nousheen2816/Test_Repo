//Write a program to read any file (property file, image file, etc) from a static method, or static block using getResourceAsStream() method


package myDay5;

import java.io.*;
import java.util.*;

public class ReadPropertyFile 
{
	 
	    private static Properties p;
	     
	    static
	    {
	        InputStream is = null;
	        try 
	        {
	            p = new Properties();
	            is = ClassLoader.class.getResourceAsStream("D:/myFile.properties");
	            p.load(is);
	        } 
	        catch (FileNotFoundException e) 
	        {
	            e.printStackTrace();
	        }
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	     
	    public static String getPropertyValue(String f){
	        return p.getProperty(f);
	    }
	     
	    public static void main(String a[]){
	         
	        //System.out.println("db.host: "+getPropertyValue("db.host"));
	        System.out.println("db.user: "+getPropertyValue("UserName : "));
	        System.out.println("db.password: "+getPropertyValue("Password : "));
	    }
	}
	
 
	


