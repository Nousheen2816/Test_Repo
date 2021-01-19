package myDay6;


class Transport{
	
	synchronized  void trans(String message)//synchronized method here means that no other thread can call it until and unless the thread which has entered is an exit.
    {
        System.out.print(" [[ Hiii, I'm " + message );
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("]]");
    }
}

class Vehicle extends thread
{
    String message;
    Transport src;
    Thread t;

    public Vehicle(Transport s, String m)
    {
        src=s;
        message=m;
        t=new Thread(this);
        t.start();
    }

    public void run()
    {
        
        src.trans(message);
    }
}
public class SynchronizedMethod 
{
	 public static void main(String [] args)
	 {
		 Transport target=new Transport();

		 Vehicle v1= new Vehicle(target, "Bike");
		 Vehicle v2= new Vehicle(target, "Car");
		 Vehicle v3= new Vehicle(target, "Bus");

	        try{
	            v1.t.join();
	            v2.t.join();
	            v3.t.join();
	        }
	        catch(InterruptedException e)
	        {
	            System.out.println("Interrupted");
	        }
	    }

}
