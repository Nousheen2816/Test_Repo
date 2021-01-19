//Write a java program to find factorial of  a number

package myDay2;

import java.util.Scanner;

public class Factorial {
	 public static void main(String args[])
	    {
	        int fact=1;
	        Scanner ab = new Scanner(System.in);
			
	        System.out.print("Enter a Number : ");
	        int num = ab.nextInt();
			
	        for(int i=num; i>0; i--)
	        {
	            fact = fact*i;
	        }
			
	        System.out.print("Factorial of " + num + " is " + fact);
	        ab.close();
	    }

}
