// Write a program to convert Integer to Float using wrapper class methods

package myDay3;

import java.util.Scanner;

public class IntFltWrapper {
	public static void main(String[] args) 
	{ 
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the Integer");
		int num=ab.nextInt();
		Integer nobj=new Integer(num);
		float f=nobj.intValue();
		System.out.println(f);
		ab.close();
	}
}
