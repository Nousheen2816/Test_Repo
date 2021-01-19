// Write a Programs for unreachable code.

package myDay4;

public class UnreachableCode
{ 
		public static void main(String args[]) 
		{  
			int a = 2; 
			for (;;)
			{ 

				if (a == 2)
				{ 
					break; 
					System.out.println("I want to get printed"); //Inside an "if statement" if there is any break statement with outer infinite loop,then the code after break in unreachable 
				} 
			} 
			try
			{ 
				throw new Exception("Hi,I'm an Exception"); 
				System.out.println("Hi,I'm an unreachable code");//Any statement after throwing an exception is unreachable code 
			} 
			catch (Exception exception) 
			{ 
				exception.printStackTrace(); 
			} 


			System.out.println("Hi,I'm reachable code"); 
			return; //Any statement after return is not executed and is unreachable code
			System.out.println("Hi,I'm an unreachable code"); 
		
		}
}



