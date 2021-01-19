package myDay6;

public class SynchronizationJoinMethod extends thread{
	public void run()
   	{
       		System.out.println("Thread1 is running");
       		try 
       		{
        		Thread.sleep(500);
    		}
       		catch(InterruptedException ie)
       		{ }
       		System.out.println("Thread2 is running ");
  	}
	public static void main(String[] args)
	{
		SynchronizationJoinMethod t1=new SynchronizationJoinMethod();
		SynchronizationJoinMethod t2=new SynchronizationJoinMethod();
		t1.start();

		try{
  			t1.join();	//Waiting for t1 to finish
		}
		catch(InterruptedException ie){}

		t2.start();
	}

}
