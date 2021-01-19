//	Write a program to find the transpose of a matrix

package MyDay1;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String args[])
	   {
	       int i, j;
	       int a1[][] = new int[3][3];
	       int a2[][] = new int[3][3];
	       Scanner ab = new Scanner(System.in);
		   
	       System.out.print("Enter  Array Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               a1[i][j] =ab.nextInt();
	           }
	       }
		   
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               a2[i][j] = a1[j][i];
	           }
	       }
		   
	       System.out.print("Transpose of the Matrix is :\n");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               System.out.print(a2[i][j]+ " ");
	           }
	           System.out.println();
	       }
	       ab.close();
	   }
}
