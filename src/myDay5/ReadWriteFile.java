//Java program to read content from one file and write it into another file.


package myDay5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile
{
	public static void main(String[] args) 
	{
		try
		{
			boolean create=true;
			Scanner ab=new Scanner(System.in);

			System.out.print("Enter Source File Name:");
			String str=ab.next();
			File src=new File(str);
			if(!src.exists())
			{
				System.out.println("File Not Found..");
			}
			else
			{
				FileInputStream fi=new FileInputStream(str);
				System.out.print("Enter Target File Name:");
				String filename=ab.next();
				File file=new File(filename);
				if(file.exists())
				{  
					System.out.print("File Already Exist OverWrite it..Yes/No?:");
					String confirm=ab.next();
					if(confirm.equalsIgnoreCase("yes"))
					{ 
						create=true;
					}
					else 
					{
						create=false;  
					} 
				}  
				if(create)
				{
					FileOutputStream FO=new FileOutputStream(filename);
					int b;
					//read content and write in another file
					while((b=fi.read())!=-1)
					{ 
						FO.write(b);
					}
					System.out.println("\nFile Copied...");
				}
				fi.close();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
