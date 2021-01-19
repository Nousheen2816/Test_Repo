//	Write a program to reverse a given number

package MyDay1;

import java.util.Scanner;

public class ReverseNum{
	public static void main(String[] args) 
	{ 
		int num,rev=0;
	//String str= System.console().readLine(); 
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the numbers");
		num=ab.nextInt();
		System.out.println("Before reversing: "+ num);
		while(num!=0)
		{
			 rev= rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		
		System.out.println("After reversing: "+ rev);
		ab.close();
}
}
