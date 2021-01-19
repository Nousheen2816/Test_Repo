//. Write java thread program with below specifications with join method Should have 2 threads   one-static method one-synchronized method,one-static synchronized method


package myDay6;

public class DifferentSynchronizations implements Runnable {
	int tickets = 5;
	static int num=5;
    static int i = 3, j = 4;
    static int x=2,y=3;
    static void display(String name)
	{
	System.out.println(name +" is  in a theater");
	}
    synchronized static void popCorn(String name ,int n)//locks the class
    {  
    	if(n<=num)
    	{
    		System.out.println(n +" Popcorn ordered by " +name);
    	}
    	else
    	{
    		System.out.println("Popcorn not available for " + name);
    	}
    	  
     }  
    synchronized void booking (String name, int reqtickets)//locks the object
    {
        if (reqtickets <= tickets)
        {
         System.out.println (reqtickets + " booked to " + name);
         tickets = tickets - reqtickets;
        }
        else
        {
         System.out.println ("Tickets not available to " + name);
        }
    }
    public void run ()
    {
        String name = Thread.currentThread ().getName ();
        if (name.equals ("John"))
        {
         booking (name, i);
        }
        else
        {
         booking (name, j);
        }
        if (name.equals ("John"))
        {
         popCorn (name, x);
        }
        else
        {
         popCorn (name, y);
        }
        display("John");
        display("Kevin");
    }

    public static void main (String[]args)
    {
    	DifferentSynchronizations s = new DifferentSynchronizations ();
        Thread t1 = new Thread (s);
        Thread t2 = new Thread (s);
        t1.setName ("John");
        t2.setName ("Kevin");
        t1.start ();
        t2.start ();
    }

}
