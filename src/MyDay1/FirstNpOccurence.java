//	Write a program to find first occurence of non repeated element in a string

package MyDay1;
import java.util.Scanner;

public class FirstNpOccurence {
	public static void main(String[] args)  
	{ 
	//String str= System.console().readLine();  
		Scanner ab=new Scanner (System.in);
		System.out.println("Enter the string");
		String str=ab.nextLine();
		boolean found=false; 
		for(int i=0;i<str.length();i++) 
		{ 
			found=true; 
			char c=str.charAt(i); 
			for(int j=0;j<str.length();j++) 
			{ 
				if(c==str.charAt(j)&&j!=i) 
				{ 
					found=false; 
					break; 
				} 
			} 
	  
			if(found) 
			{ 
				System.out.println("First occurence in the word :"+c); 
				break; 
			} 
		} 
		if(!found) 
		{ 
			System.out.println("There's no first occurence in the word"); 
		} 
		ab.close();
		} 
	} 
	 
