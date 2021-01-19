// Write a Program to get Illegal access exception.


//Write a Program to get Illegal access exception.

package myDay4;


public class IllegalAccessExcep {
		   int m;
		   public void setMarks(int marks) {
		      if(marks < 0 || marks > 100)
		         throw new IllegalArgumentException(Integer.toString(marks));
		      else
		         m = marks;
		   }
		   public static void main(String[] args) {
			   IllegalAccessExcep s1 = new IllegalAccessExcep();
		      s1.setMarks(45);
		      System.out.println(s1.m);
		      IllegalAccessExcep s2 = new IllegalAccessExcep();
		      s2.setMarks(101);
		      System.out.println(s2.m);
		   }
		}


