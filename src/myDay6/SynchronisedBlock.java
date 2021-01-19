//Write a thread class with synchronize block

package myDay6;

class WTransport {
	 void trans(String message)
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

class WVehicle extends thread
{
    String message;
    WTransport src;
    Thread t;

    public WVehicle(WTransport s, String m)
    {
        src=s;
        message=m;
        t=new Thread(this);
        t.start();
    }

    public void run()
    {
        
       synchronized(src)//When a thread invokes a code within synchronized block, it automatically acquires the lock for that object and releases it when the synchronized block executed.
       {
        src.trans(message);
       }
    }
}
public class SynchronisedBlock 
{
	 public static void main(String [] args)
	 {
		 WTransport target=new WTransport();

		 WVehicle v1= new WVehicle(target, "Boat");
		 WVehicle v2= new WVehicle(target, "SubMarine");
		 WVehicle v3= new WVehicle(target, "Cruse");

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
