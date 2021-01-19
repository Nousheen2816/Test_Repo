// Get DOS based basic attributes like file’s hidden, read-only property etc


package myDay5;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Scanner;

public class DOSAttributes {
	public static void main(String[] args) throws Exception 
    {
    	Scanner ab=new Scanner(System.in);
    	System.out.print("Enter the file path : ");
    	String str=ab.next();
        Path path = FileSystems.getDefault().getPath(str);
   
        DosFileAttributeView view = Files.getFileAttributeView(path,DosFileAttributeView.class);//creating an object
  
        DosFileAttributes attributes = view.readAttributes();//reading the attributes

        System.out.println("Is file Archive : " + attributes.isArchive());
        System.out.println("Is file Hidden : " + attributes.isHidden());
        System.out.println("Is file ReadOnly : " + attributes.isReadOnly());
        System.out.println("Is file System : " + attributes.isSystem());
    }

}
