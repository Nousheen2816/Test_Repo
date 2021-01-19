//	Write a program to multiply the matrices

package MyDay1;

import java.util.Scanner;

public class MulMatrix {
	public static void main(String args[])
	   {
	   
	      int a1, a2, b1, b2, sum = 0, i, j, k;
	      Scanner ab = new Scanner(System.in);
	      
	      System.out.print("Enter Number of Rows and Columns of First Matrix : ");
	      a1 = ab.nextInt();
	      a2 = ab.nextInt();
	      
	      int first[][] = new int[a1][a2];
	      
	      System.out.print("Enter First Matrix Elements : ");
	      
	      for(i=0 ; i<a1; i++)
	      {
	         for(j=0; j<a2; j++)
	         {
	            first[i][j] = ab.nextInt();
	         }
	      }
	 
	      System.out.print("Enter Number of Rows and Columns of Second Matrix : ");
	      b1 = ab.nextInt();
	      b2= ab.nextInt();
	 
	      if ( a2 != b1 )
	      {
	         System.out.print("Matrix of the entered order can't be Multiplied..!!");
	      }
	      else
	      {
	         int second[][] = new int[b1][b2];
	         int multiply[][] = new int[a1][b2];
	 
	         System.out.print("Enter Second Matrix Elements :\n");
	 
	         for(i=0; i<b1; i++)
	         {
	            for(j=0; j<b2; j++)
	            {
	               second[i][j] = ab.nextInt();
	            }
	        }
	        
	 
	         for(i=0; i<a1; i++)
	         {
	            for(j=0; j<b2; j++)
	            {   
	               for(k=0; k<b1; k++)
	               {
	                  sum = sum + first[i][k]*second[k][j];
	               }
	 
	               multiply[i][j] = sum;
	               sum = 0;
	            }
	         }
	         System.out.print(" Matrix Multiplication Result is :\n");
	 
	         for(i=0; i<a1; i++)
	         {
	            for(j=0; j<b2; j++)
	            {
	               System.out.print(multiply[i][j] + "\t");
	            }
	            System.out.print("\n");
	         }
	      }
	      ab.close();
		  
	   }

}
