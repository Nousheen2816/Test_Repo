//	Write a program to sort an array

package MyDay1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main (String args[]){
		Scanner ab =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=ab.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of an array");
	    for(int i=0;i<a.length;i++)
		{
			a[i]=ab.nextInt();
		}
			Arrays.sort(a);
			System.out.print("Sorted Array:");
			for(int i=0;i<a.length;i++)
			{
			System.out.print(a[i]+",");
		}
	    ab.close();
	}    

}
