//Program to read the Boolean value from the file using hasNextBoolean() method of Scanner class.


package myDay5;

import java.util.Scanner;

public class ScannerBoolean {
	public static void main(String[] argv) throws Exception 
	    { 
	  
	        String str = "Nousheen 2816 false nisum 64 true false"; 
	        Scanner ab = new Scanner(str); 
	  
	        while (ab.hasNext())
	        { 
	  
	            if (ab.hasNextBoolean())
	            { 
	                System.out.println(" It is a Boolean value :" + ab.nextBoolean()); 
	            } 
	            else 
	            { 
	                System.out.println(" It is not a Boolean value :" + ab.next()); 
	            } 
	        } 
	        ab.close(); 
	    } 

}
