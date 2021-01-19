//	Write a program to reverse a each word of a string

package MyDay1;
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) 
	{ 
	//String str= System.console().readLine(); 
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=ab.nextLine();
		System.out.println("Without reversing: "+ str);	
		String word[]=str.split("\\s"); 
		String rev=""; 
		for(String sw:word) 
		{ 
			StringBuffer str1= new StringBuffer(sw); 
			str1.reverse(); 
			rev+=str1.toString()+" "; 
		} 
	 
		System.out.println("With reversing: "+ rev); 
		ab.close();
		} 
	

	}
