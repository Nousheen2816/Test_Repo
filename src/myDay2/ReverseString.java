//Write a Java Program to reverse a given string



package myDay2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) 
	{ 
		String rev=" ";
		int size;
	//String str= System.console().readLine(); 
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=ab.nextLine();
		System.out.println("Without reversing: "+ str);	
		 size = str.length();
		  
	      for(int i=size-1; i>=0; i--)
	      {
	          rev = rev + str.charAt(i);
	      }
	 
		System.out.println("With reversing: "+ rev); 
		ab.close();
		} 
	

}
