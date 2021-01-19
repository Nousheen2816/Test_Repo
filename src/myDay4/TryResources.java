//Write a Program with try with resource.


package myDay4;

import java.io.*;
public class TryResources {
	public static void main(String[] args) {
	    String line;
	    try(BufferedReader br = new BufferedReader(new FileReader("C:/Sprint1/emp1.txt"))) {
	      while ((line = br.readLine()) != null) {
	        System.out.println("Line =>"+line);
	      }
	    } catch (IOException e) {
	      System.out.println("IOException in try block =>" + e.getMessage());
	    }
	  }
}
