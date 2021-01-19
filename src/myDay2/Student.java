// Write a Java program for student class with basic student Information(name,address,section, college,class,roll no) .Here College and roll number must be unique and should be loaded once through out the class.write a method to display student info


package myDay2;

import java.util.Scanner;
import java.util.*;

public class Student {
	
	static  int sclass;
	public static void main(String args[]){
		String sname=null ;
		int rno=0;
		final int sclass=10;
		final String college="MJCET";
		String sec=null;
		String adds=null;
		

		System.out.println("Please enter your data \n\n\n");
		Scanner ab= new Scanner(System.in);
		System.out.println("How many records would you like to enter : ");
		 for (int i = ab.nextInt(); i >0 ; i--) 
		 {
        System.out.println("Enter a Student name : ");
        sname=ab.next();
        System.out.println("Enter a Student Section : ");
        sec=ab.next();
        System.out.println("Enter a Student address : ");
        adds=ab.next();
        System.out.println("Enter a Student RollNO: ");
        rno=ab.nextInt();
        System.out.println("Student Details are as follows:\n"+"Name\t"+sname+"\nClass\t"+sclass+"\nSection\t"+sec+"\nRoll No\t"+rno+"\nCollege\t"+college+"\nAddress\t"+adds);
		 }ab.close();
	
		
		
		
	}

}
/*class Student1{
	String sname;
	static  int sclass;
	int rno;
	//static  int sclass=10;
	String college;
	String sec;
	String adds;
}*/
