//Write java thread program with below specifications Should have 2 threads, first one thread execute then second thread should execute and out-put should predictable   


package myDay6;

class Hello
{
	public void display(String msg)
	  {
	    System.out.print ("["+msg);
	    try
	    {
	      Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {
	      e.printStackTrace();
	    }
	    System.out.println ("]");
	  }
}

class World extends Thread
{
	  String msg;
	  Hello h;
	  World (Hello fp,String str)
	  {
	    h = fp;
	    msg = str;
	    start();
	  }
	  public void run()
	  {
	    synchronized(h)      
	    {
	      h.display(msg);
	    }
	  }
}

public class ThreadByThreadExecution
{
	  public static void main (String[] args)
	  {
	    Hello h1 = new Hello();
	    World w = new World(h1, "Hello");
	    World w1= new World(h1,"World");
	    
	  }
}
	  