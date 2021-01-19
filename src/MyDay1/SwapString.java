//	Write a program to swap string using string methods


package MyDay1;

import java.util.Scanner;

public class SwapString {
	public static void main(String[] args) {    
        String str1 ,str2;
        Scanner ab= new Scanner(System.in);
        System.out.print("Enter a String : ");
        str1 = ab.nextLine();
        str2 = ab.nextLine();
         System.out.println("Strings before swapping:\t " + str1 + " " + str2);    
           
        str1 = str1 + str2;         
        str2 = str1.substring(0, (str1.length() - str2.length()));    
        str1 = str1.substring(str2.length());    
            
        System.out.println("Strings after swapping:\t " + str1 + " " + str2);   
        ab.close();
    }    

}
