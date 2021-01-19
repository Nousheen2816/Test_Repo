//Java program to traverse all files of a directory/folder.


package myDay5;

import java.io.File;
import java.io.IOException;

public class TraverseDirectory 
{
	public static void main(String args[])
	{
		 
        String dirName = "C:/Sprint1";
        File dirTraversed = new File(dirName);
        
        if(dirTraversed.isDirectory())//to check weather the path mentioned contains directory or is a file
        {  
               try {
                     traveseSubDirAndFiles(dirTraversed);
               		} 
               catch (IOException e) 
               {
                     e.printStackTrace();
               }
        }
        else
        {             
               System.out.println(dirName +" isn't a Directory");
        }
        
 }
 
 
 
 /*
  *  traveseSubDirAndFiles() method recursively displays all
  *  sub-directories and files present in that directory
  */
   public static void traveseSubDirAndFiles(File dir) throws IOException 
   {      
               
               System.out.println(dir.getAbsoluteFile());
         
               if(dir.isDirectory())//obtaining flies and sub-directories from present directory
               {
                     String allSubDirAndFiles[] = dir.list();

                     for(String filename : allSubDirAndFiles)//iterate through other files and sub-directories
                     {
                            traveseSubDirAndFiles(new File(dir, filename));
                     }
               }
               
 }
}
