//	Write a program for addition of 2 matrices

package MyDay1;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String args[])
	   {
	       int i, j;
	       int m1[][] = new int[3][3];
	       int m2[][] = new int[3][3];
	       int m3[][] = new int[3][3];
	       Scanner ab = new Scanner(System.in);
		   
	       System.out.print("Enter Matrix 1 Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               m1[i][j] = ab.nextInt();
	           }
	       }
		   
	       System.out.print("Enter Matrix 2 Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               m2[i][j] = ab.nextInt();
	           }
	       }
		   
	       System.out.print("Adding both Matrix ...\n");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               m3[i][j] = m1[i][j] + m2[i][j];
	           }
	       }
		   
		   
	       System.out.print("The New Matrix will be :\n");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               System.out.print(m3[i][j]+ " ");
	           }
	           System.out.println();
	       }
	       ab.close();
	   }
}
