//Get list of all file objects from the given folder. First create File object by passing folder path. Call listFiles() method on file object to get list of file names in the given folder.


package myDay5;

import java.io.File;

public class ListOfFlies {
	public static void main(String a[]){
	        File file = new File("C:/Sprint1/");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	        }
	    }
}
