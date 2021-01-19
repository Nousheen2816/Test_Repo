//	Write a program to demonstrate different java variables

package MyDay1;

public class JavaVar {
	int salary; // Instance Variable
	static int pin=1234;
	 public void show() {
	  int value = 2; // Local variable
	  value = value + 10;
	  System.out.println("The Value is : " + value);
	  salary = 10000;
	  System.out.println("The salary is : " + salary);
	 }

	 public static void main(String args[]) {
	  JavaVar var = new JavaVar();
	  var.show();
	  System.out.println("The pin is:"+pin);
	 }
	}

