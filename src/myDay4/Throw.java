//Write a program by using Throw keyword.

package myDay4;

public class Throw {
	static void checkNum(int num) {
	    if (num < 10) {
	      throw new ArithmeticException("Access denied - Enter a number greater than 10.");
	    }
	    else {
	      System.out.println("Access granted - number entered is valid");
	    }
	  }

	  public static void main(String[] args) {
	    checkNum(6); 
	  }

}
