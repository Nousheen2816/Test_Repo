//	Write a program for determine even and dd in given range

package MyDay1;

import java.util.Scanner;

public class EvenOdd {
	public static void main (String args[]){
		int r,i;
		Scanner ab=new Scanner(System.in);
		System.out.print("Enter the first number for the range: ");
		int num1=ab.nextInt();
		System.out.print("Enter the second number for the range: ");
		int num2=ab.nextInt();
		System.out.print("\nEven numbers between "+num1+" and "+num2+" are :");
		i=num1; 
		while(i<=num2)
		{ 
			r=i%2; 
			if(r==0) 
			System.out.print(i+" ");
			i++;
		}
		System.out.print("\nOdd numbers between "+num1+" and "+num2+" are :");
		i=num1;
		while(i<=num2)
		{ 
			r=i%2; 
			if(r==1) 
			System.out.print(i+" ");
			 i++;
		}
		
		ab.close();
		}
}
