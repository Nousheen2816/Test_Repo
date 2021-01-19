//	Write a program for convert decimal number to binary number

package MyDay1;
import java.util.Scanner;

public class DecBin {
	 public static void main(String args[])
	    {
	        int dn, quot, i=1, j;
	        int bn[] = new int[100];
			Scanner ab = new Scanner(System.in);
			
	        System.out.print("Enter any Decimal Number : ");
	        dn = ab.nextInt();
	        quot = dn;
			
	        while(quot != 0)
	        {
	            bn[i++] = quot%2;
	            quot = quot/2;
	        }
			
	        System.out.print("Equivalent Binary Value of " + dn + " is :\n");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(bn[j]);
	        }
	        ab.close();
	    }

}
