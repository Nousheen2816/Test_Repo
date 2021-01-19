package myDay4;

import java.util.Scanner;

public class TryCatchArrayObiMsg {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = ab.nextInt();
		int a[]= new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the array values" + i + ":");
			a[i] = ab.nextInt();
		}
		System.out.println("Enter array index to get the value:");

	 try 
	 {
         int index = ab.nextInt();
         System.out.println("Value at " + index + " = " + a[index]);
      
      } catch(ArrayIndexOutOfBoundsException e) 
	 {
    	  System.out.println("There's an exception : "+e);
      }
	 ab.close();
	}

}
