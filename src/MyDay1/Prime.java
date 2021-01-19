//	Write a program to find prime numbers in given range

package MyDay1;

import java.util.Scanner;

public class Prime {
		public static void main (String args[]){
			Scanner ab=new Scanner(System.in);
			System.out.print("Enter the first number for the range: ");
			int num1=ab.nextInt();
			System.out.print("Enter the second number for the range: ");
			int num2=ab.nextInt();
			System.out.print("\nPrime numbers between "+num1+" and "+num2+" are :");
			int count;
			for(int i = num1 ; i <= num2 ; i++)
			{
				count = 0;
				for(int j = 1 ; j <= i ; j++)	
				{
					if(i % j == 0)
					count = count+1;
				}
				if(count == 2)
				System.out.println(i);
	}
			ab.close();

}
}
