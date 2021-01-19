//	Write a program to merge 2 arrays

package MyDay1;
import java.util.Scanner;

public class MergeArray {
	public static void main(String args[])
	   {
	       int a1, a2, size, i, j;
	       int b1[] = new int[50];
	       int b2[] = new int[50];
	       int merge[] = new int[100];
	       Scanner ab = new Scanner(System.in);
		   
	       System.out.print("Enter Array 1 Size : ");
	       a1 = ab.nextInt();
		   
	       System.out.print("Enter Array 1 Elements : ");
	       for(i=0; i<a1; i++)
	       {
	           b1[i] = ab.nextInt();
	       }
		   
	       System.out.print("Enter Array 2 Size : ");
	       a2 = ab.nextInt();
		   
	       System.out.print("Enter Array 2 Elements : ");
	       for(i=0; i<a2; i++)
	       {
	           b2[i] = ab.nextInt();
	       }
		   
	       System.out.print("Merging the Arrays...\n");
	       for(i=0; i<a1; i++)
	       {
	           merge[i] = b1[i];
	       }
		   
	       size = a1 + a2;
		   
	       for(i=0, j=a1; j<size && i<a2; i++, j++)
	       {
	           merge[j] = b2[i];
	       }
		   
	       System.out.print("Now the New Array after Merging is :\n");
	       for(i=0; i<size; i++)
	       {
	           System.out.print(merge[i] + "  ");
	          
	       }
	       ab.close();
	   }
}


