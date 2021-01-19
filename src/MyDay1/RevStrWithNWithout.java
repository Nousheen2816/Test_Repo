//Program to print reverse of a string without and with using String methods

package MyDay1;
import java.util.Scanner;

class WithoutMethod
{
	public  static String revStr(String str) {
		char ch[] = str.toCharArray(); //Converting string to character array
	      int n = ch.length;
	      char res[] = new char [n];//another string creation
	      for(int i = 0; i<ch.length; i++)
	      {
	         res[n-1] = ch[i];
	         n = n - 1;
	      }
	      return new String(res);
	}
}
class WithMethod{
	
	
}
	public class RevStrWithNWithout {
		
	public  static void main(String[] args)
	   { 
		int size;
	  	String rev=" ";
	      Scanner ab = new Scanner(System.in);
	      System.out.println("Enter a String : ");
	      String str = ab.nextLine();
	      String result = WithoutMethod.revStr(str);
	      System.out.println("String reversed without string methods "+result);
	  	 size=str.length();
	       for(int i=size-1; i>=0; i--)
	       {
	           rev = rev + str.charAt(i);
	       }
	     
	      System.out.println("String reversed with string methods: "+ rev); 
	 
	      ab.close();
	   }
	      
	      
	   
}
