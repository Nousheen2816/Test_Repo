//	Write a program to print a matrix

package MyDay1;

import java.util.Scanner;

public class MatrixPrint {
	public static void main(String args[])
	   {
	       int row, col, i, j;
	       int a[][] = new int[10][10];
	       Scanner ab = new Scanner(System.in);
		   
	       System.out.print("Enter Number of Row for Array : ");
	       row = ab.nextInt();
	       System.out.print("Enter Number of Column for Array: ");
	       col = ab.nextInt();
		   
	       System.out.print("Enter " +(row*col)+ " Array Elements : ");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               a[i][j] = ab.nextInt();
	           }
	       }
		   
	       System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(a[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	       ab.close();
	   }

}
