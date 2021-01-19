//Static block and static method : write program to illustrate which one executes first

package myDay2;

public class StaticBlockNmethod {
		static void display()
		{
			System.out.println("Hello,I'm a Static Method.");
	 	}
		   static{
		      System.out.println("Hello,I'm a Static Block");
		   }
		   public static void main(String args[])
		   {
		      System.out.println("Hello,I'm a  main method");
		   }
		}


