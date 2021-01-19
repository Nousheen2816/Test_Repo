//Write Thread program using below methods Sleep() method,interrupt() method

package myDay6;


class thread extends Thread 
{ 
	public void run()  
    {    
		
        try  
        {    
            Thread.sleep(1000);    
            System.out.println("Hii,I'm a thread");    
        }
        catch(InterruptedException e)
        {    
            throw new RuntimeException("Thread is interrupted"+e);  
              
        }    System.out.println("Thread is runnng..");//t1 thread executes normally without interruption
    }
}    
public class SleepInterrupt {
	
    public static void main(String args[])  
    {    
    	thread t=new thread();    
        t.start(); 
        thread t1=new thread();    
       	t1.start();
        try 
        {    
            t.interrupt();    //t thread is interrupted 
        }
        catch(Exception e)
        {
        	System.out.println("Exception is handled "+e);
        }    
    }    

}
