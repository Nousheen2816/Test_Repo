//Write a Java program to find if a number is odd or even

package myDay2;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main (String args[]){
		Scanner ab=new Scanner(System.in);
		System.out.print("Enter the  number : ");
		int num1=ab.nextInt();
		if(num1%2==0)
		{
			System.out.println("The number is even");
		}
		else
			System.out.println("The number is odd");
		
		ab.close();
		}

}
