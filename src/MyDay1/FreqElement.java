//	Write a program to find frequent element in an array

package MyDay1;

import java.util.Scanner;

public class FreqElement {
	public static void main(String[] args) 
	{ 
		int n,i; 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=a.length;
		int countmax=1;
		int temp=a[0];
		int count=1;
		for(i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
				count++;
			else
			{
				if(count>countmax)
					{
					countmax=count;
					temp=a[i-1];
					}
				count=1;
			}
		}
			if(count>countmax)
			{
				countmax=count;
				temp=a[l-1];
				
			}
			System.out.println("The most frequent number is "+temp);
			sc.close();	
	}
}
