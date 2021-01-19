//Write a Program to handle No such method exception.


package myDay4;

public class TryCatchNoMethodExcep {
		public void Student() 
			{ 
				Class i; 
				try { 
					i = Class.forName("myDay4.Finally"); 
					try
					{ 
						Class[] p = new Class[5]; 
					} 
					finally {
						System.out.println("dds");
					}
				
				} 
				catch (Exception e) { 
					e.printStackTrace(); 
				} 
			} 

		public static void main(String[] args) 
			{ 
				new Stud(); 
			} 
		} 

