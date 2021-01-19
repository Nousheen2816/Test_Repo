//Write a program to read file content line by line. To get this, you have to use BufferedReader object. 

package myDay5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	 public static void main(String args[]){ 
	        String str = "emp.txt"; 
	        BufferedReader br = null; 
	        String line = ""; 
	        try 
	        { 
	            br = new BufferedReader(new FileReader(str)); 
	            System.out.println("Contents of the file : \n"); 
	            while( (line = br.readLine()) != null)
	            { 
	                System.out.println(line); 
	            } 
	        } 
	        catch (FileNotFoundException e) 
	        { 
	            System.err.println("Enter the valid file name and file path"); 
	            e.printStackTrace(); 
	        } 
	        catch (IOException e)
	        { 
	            System.err.println("Cannot read the file."); 
	            e.printStackTrace(); 
	        } 
	    } 
}
