//	Write a program to remove whitespaces from the string

package MyDay1;
import java.util.Scanner;

public class WhiteSpaces {
	 
	public static void main(String[] args) 
	{ 
	/*String str= System.console().readLine(); */
		Scanner ab =new Scanner (System.in);
		System.out.println("Enter the string");
		String str=ab.nextLine();
		String str1 = str.replaceAll("\\s", ""); 
		System.out.println("With white spaces: "+ str); 
		System.out.println("Without white spaces: "+ str1); 
		ab.close();
	} 
}	

	 
