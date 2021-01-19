// Get creation, last access and last modified time of a file from a defined folder


package myDay5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Scanner;

public class TimeOfFile {
	public static void main(String[] args) throws Exception
    {
    	Scanner ab=new Scanner(System.in);
    	System.out.print("Enter the file path : ");
    	String str=ab.next();
        Path path = Paths.get(str);
        BasicFileAttributeView view = Files.getFileAttributeView(path,BasicFileAttributeView.class);

        BasicFileAttributes attributes = view.readAttributes();
        
        FileTime lastModifedTime = attributes.lastModifiedTime();
        FileTime creationTime = attributes.creationTime();

        long currentTime = Calendar.getInstance().getTimeInMillis();
        FileTime lastAccessTime = FileTime.fromMillis(currentTime);

        view.setTimes(lastModifedTime, lastAccessTime, creationTime);
        
        System.out.println("Creation time of file : " +attributes.creationTime());
        System.out.println("Last modification time of file : " +attributes.lastModifiedTime());
        System.out.println("Last access time of file  : " +attributes.lastAccessTime());
    }

}
