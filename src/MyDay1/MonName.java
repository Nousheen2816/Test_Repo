//	Write a program for find month name from the month number

package MyDay1;

import java.util.Scanner;

public class MonName {
	public static void main(String[] args) 
	{ 
		String name=null;
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int num=ab.nextInt();
	switch(num)
	{
	  case  1: name = "January";
	  break;
	  case  2: name = "February";
	  break;
	  case  3: name = "March";
	  break;
	  case  4: name = "April";
	  break;
	  case  5: name = "May";
	  break;
	  case  6: name = "June";
	  break;
	  case  7: name = "July";
	  break;
	  case  8: name = "August";
	  break;
	  case  9: name = "September";
	  break;
	  case  10: name = "October";
	  break;
	  case  11: name = "November";
	  break;
	  case 12: name = "December";
	  break;
	}

	
	    if (num < 1 || num > 12) {
	        System.out.println("You have entered an invalid month number");
	    }//else 
	       // break; 

		System.out.printf("The name of month number %d is %s\n",num,name);
	    ab.close();
	}
	}
