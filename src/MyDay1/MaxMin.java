//	Write a program to find max and min in an array

package MyDay1;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMin {
	public static void main (String args[]){
	Scanner ab =new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=ab.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements of an array");
	/*int max = a[0];
    int min = a[0];*/
    for(int i=0;i<a.length;i++)
	{
		a[i]=ab.nextInt();
	}
     /* if(max < a[i])
      {
        max = a[i];
      }
      else if(min > a[i])
      {
        min = a[i];
      }		   		   
    }
    System.out.println("Maximum number = " + max + " Minimum number = " + min);*/
	Arrays.sort(a);

    System.out.println("Maximum number = " 
         + a[a.length - 1] + " Minimum number = " + a[0]);
    ab.close();
	}
}
