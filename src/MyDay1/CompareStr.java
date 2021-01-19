//Write a java program on string comparision possibilities

package MyDay1;

import java.util.Scanner;

public class CompareStr {
	public static void main(String args[])
	   {
	      String str1, str2;
	      Scanner ab = new Scanner(System.in);
	 
	      System.out.println("Enter First String");//Enter first string to be compared
	      str1 = ab.nextLine();
	 
	      System.out.println("Enter Second String");//Enter second string to be compared
	      str2 = ab.nextLine();
	 
	      if(str1.compareTo(str2) > 0)//uses compareTo() method to comapare the strings 
	      {
	         System.out.println("String1 is Greater than String2.");//returns if str1 is greater than str2
	      }
	      else if(str1.compareTo(str2) < 0)
	      {
	         System.out.println("String1 is Smaller than String2.");//returns if str1 is less than str2
	      }
	      else
	      {
	         System.out.println("String1 and string2 are equal ");//returns if both the strings are equal
	         
	      }
	      ab.close();
	   }

}
