//	Write a program to delete an element from an array

package MyDay1;

import java.util.Scanner;

public class DelElement {
	public static void main(String args[])
	   {
	       int  i, del, count=0,l;
	       int a[] = new int[50];
	       Scanner ab = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       l = ab.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<l; i++)
	       {
	           a[i] = ab.nextInt();
	       }
		   
	       System.out.print("Enter Element to be Delete : ");
	       del = ab.nextInt();
	    		   for(i=0; i<l; i++)
	    	       {
	    	           if(a[i] == del)
	    	           {
	    	               for(int j=i; j<(l-1); j++)
	    	               {
	    	                   a[j] = a[j+1];
	    	               }
	    	               count++;
	    	               break;
	    	           }
	    	       }
	    	       if(count==0)
	    	       {
	    	           System.out.print("Element Not Found..!!");
	    	       }
	    	       else
	    	       {
	    	           System.out.print("Element Deleted!!");
	    	           System.out.print("\nNow the New Array is :\n");
	    	           for(i=0; i<(l-1); i++)
	    	           {
	    	               System.out.print(a[i]+ " ");
	    	           }
	    	       }
	    	       ab.close();
	    	   }

}
