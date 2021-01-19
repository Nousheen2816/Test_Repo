//Write a java program to display error caused by stackoverflow

package myDay4;

class Stack {
	 public static void test(int i) 
	    { 
	        if (i == 0) 
	            return; 
	        else { 
	            test(i++); //continuous recursion
	        } 
	    } 
	} 
	public class ErrorStack { 
	  
	    public static void main(String[] args) 
	    { 
	  
	        // eg of StackOverflowError 
	        Stack.test(3); 
	    } 
}
