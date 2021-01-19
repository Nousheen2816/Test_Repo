//Write a program to print the given string in reverse order using StringBuffer methods

package myDay3;

import java.util.Scanner;

public class StrBufRev {
	public static void main(String[] args) 
	{ 
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=ab.nextLine();
		StringBuffer str1 = new StringBuffer(str);
	      str1.reverse();
	      System.out.println(str1);
	      ab.close();
	}
}
