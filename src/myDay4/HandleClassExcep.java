////Write a Program to handle Class not found exception.


package myDay4;

public class HandleClassExcep {
	public static void main(String args[]) {
	     try {
	         Class.forName("myDay4.Finally");
	      }
	     catch (ClassNotFoundException e)
	      {
	        	e.printStackTrace();
	      }
	   }
}
