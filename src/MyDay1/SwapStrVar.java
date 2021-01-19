//	Write a program to swap string variables without third variable

package MyDay1;

import java.util.Scanner;


public class SwapStrVar {

	private static String remove( String str1,String str2) {
		// TODO Auto-generated method stub
		return str1;
	}
	public static String returnFirst(String x, String y) {
	    return x;
	}
	public static void main(String args[]){
		String str1,str2;
		 Scanner ab= new Scanner(System.in);
		 System.out.println("Enter the strings to be swaped");
		 str1 = ab.nextLine();
		 str2= ab.nextLine();
		 
		System.out.print("Before swap:\ta = " + str1 + "\tb= " + str2);
		//str1 = str1 + str2;
		str1= returnFirst(str2 ,str2=str1);	
		str2=remove(str2,str1);	
		System.out.print("\n\nAfter swap:\ta = " + str1 + "\tb = " + str2);
		ab.close();
	

	}
	
}
