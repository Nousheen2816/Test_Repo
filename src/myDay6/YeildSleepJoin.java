//Write Thread program using below methods yield() method ,Join() method,Sleep() method

package myDay6;

class Program1 extends Thread
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Program1 : " + i);
         Thread.yield();
      }
   }
}
 
class Program2 extends Thread
{
   public void run()
   {System.out.println("First thread started");
   System.out.println("Sleeping for 2 seconds");
   try
   {
      Thread.sleep(2000);
   } catch (InterruptedException e)
   {
      e.printStackTrace();
   }
   System.out.println("First task completed");
}
   }

public class YeildSleepJoin
{
		public static void main (String args[]) throws InterruptedException
		{
			Program1 t1 = new Program1();
			Program2 t2 = new Program2();
			t1.start();
			t2.start(); 
			t2.join();
			System.out.println("End of executuion ");
		}
}
	



