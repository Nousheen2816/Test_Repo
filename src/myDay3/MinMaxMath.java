//Write a program to print Minimum and maximum numbers using Math class?

package myDay3;

import java.util.Scanner;

public class MinMaxMath {
	public static void main(String[] args) 
	{ 
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the first Integer");
		int num1=ab.nextInt();
		System.out.println("Enter the second Integer");
		int num2=ab.nextInt();
		System.out.println("Enter the first double");
		double d1=ab.nextDouble();
		System.out.println("Enter the second double");
		double d2=ab.nextDouble();
		System.out.println("Maximum of "+num1+" and "+num2+" : "+Math.max(num1,num2));
		System.out.println("Minimum of "+num1+" and "+num2+" : "+Math.min(num1,num2));
		System.out.println("Maximum of "+d1+" and "+d2+" : "+Math.max(d1,d2));
		System.out.println("Minimun of "+d1+" and "+d2+" : "+Math.min(d1,d2));
		ab.close();
	}
	

}
