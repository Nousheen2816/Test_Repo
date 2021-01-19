//	Write a program to count number of words in given string


package MyDay1;

import java.util.Scanner;

public class CountWords {
	public static int countWords(String str)
    {
        int count = 1;
        for(int i=0; i<=str.length()-1; i++)
        {
            if(str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
    }
   public static void main(String args[])
   {
        String s1;
        Scanner ab= new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        s1 = ab.nextLine();
		
        System.out.print("Total Number of Words in Entered String is " + countWords(s1));
        ab.close();
   }

}
