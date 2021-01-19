package MyDay1;

import java.util.Scanner;

public class Percentage {
	public static void main(String args[]) {
	      //String data = "Hello HOW are you MR 51";
		 String str1 ;
	        Scanner ab= new Scanner(System.in);
	        System.out.print("Enter a String : ");
	        str1 = ab.nextLine();
	      char [] charArray = str1.toCharArray();
	      int upper = 0;
	      int lower = 0;
	      int digit = 0;
	      int schar = 0;

	      int tchar = str1.length();
	      for(int i=0; i<str1.length(); i++) {
	         if (Character.isUpperCase(charArray[i])) {
	            upper++;
	         } else if(Character.isLowerCase(charArray[i])) {
	            lower++;
	         } else if(Character.isDigit(charArray[i])){
	            digit++;
	         } else {
	            schar++;
	         }
	      }
	      System.out.println("Total length of the string :"+tchar);
	      System.out.println("Upper case :"+upper);
	      System.out.println("Percentage of upper case letters: "+(upper*100)/tchar);
	      System.out.println("Lower case :"+lower);
	      System.out.println("Percentage of lower case letters:"+(lower*100)/tchar);
	      System.out.println("Digit :"+digit);
	      System.out.println("Percentage of digits :"+(digit*100)/tchar);
	      System.out.println("Special Characters :"+schar);
	      System.out.println("Percentage of special characters :"+(schar*100)/tchar);
	      ab.close();
	   }

}
