//	Write a program for pascal triangle

package MyDay1;
import java.util.Scanner;

public class Pascal {
	public static void main(String[] args)  
	{ 
	//String str= System.console().readLine();
		int r,c=1,n;
		System.out.print("Enter the number");
		Scanner ab=new Scanner (System.in);
		r=ab.nextInt();
		for(int i=0;i<r;i++)
		{
			for(n=r;n>i;n--)
			{
				System.out.print(" ");
			}
			c=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+c);
					c=c*(i-j)/(j+1);	
			}
			System.out.print("\n");
		}
		
		ab.close();
	
		
	}
}
