//	Write a program to convert first letter of string into capital

package MyDay1;

import java.util.Scanner;

public class FirstCapital {
	public static void main(String[] args) {    
		 String str;
	        Scanner ab= new Scanner(System.in);
	        System.out.print("Enter a String : ");
	        str = ab.nextLine();
	        String res = str.substring(0, 1).toUpperCase() + str.substring(1);
	        System.out.println(res);
	        ab.close();
}
}
