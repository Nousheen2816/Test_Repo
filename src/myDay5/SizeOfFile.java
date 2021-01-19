//Java Program to get the size of a given file in bytes, kilobytes, and megabytes

package myDay5;

import java.io.File;

public class SizeOfFile {
	public static void main(String[] args) 
	{
		File file = new File("C:/Sprint1/emp.txt");
		long fileSize = file.length();
		System.out.println("File size in bytes is : " + fileSize);
		System.out.println("File size in KB is : " + (double)fileSize/1024);
		System.out.println("File size in MB is : " + (double)fileSize/(1024*1024));
	}
}
