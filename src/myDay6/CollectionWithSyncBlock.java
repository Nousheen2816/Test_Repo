//Write a java program with below conditions   Should have 2 threads -use collections update operations  use a synchronized block


package myDay6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



class MyThread1 implements Runnable{
    List lis = null;
      
    public MyThread1(List l) {
        this.lis = l;
    }
    public void run() {
    	System.out.println("Fetching current thread name.."); 
        System.out.println(Thread.currentThread().getName());
       
    	synchronized (lis)
    	{
		    Iterator<CollectionWithSyncBlock> it = lis.iterator();
		    while (it.hasNext()) {
		        System.out.println(it.next());
		   }
        }
         
    }
}

public class CollectionWithSyncBlock extends thread {
	String id;
	String status;
	CollectionWithSyncBlock (String id,String status)
	{
		this.id=id;
		this.status=status;
		
	}
	 public String toString() 
		{
			return "  [ "+id + " , " + status +" ]";
		}
	 public static void main(String args[])
		{
		 ArrayList<CollectionWithSyncBlock> list= new ArrayList<>();
		 List<CollectionWithSyncBlock> safeList = Collections.synchronizedList(list);
			
			list.add( new CollectionWithSyncBlock ("0345" , "COMPLETED"));
			list.add( new CollectionWithSyncBlock ("0456" , "COMPLETED"));
			list.add( new CollectionWithSyncBlock ("0789" , "IN-TRNASIT"));
			list.add( new CollectionWithSyncBlock ("0346" , "PENDING"));
			list.add( new CollectionWithSyncBlock ("0347" , "PENDING"));
			list.add( new CollectionWithSyncBlock ("0348" , "CANCELLED"));
			list.add( new CollectionWithSyncBlock ("0678" , "PENDING"));
			
		
			
			 	Thread t1 = new Thread(new MyThread1(list));
		        Thread t2 = new Thread(new MyThread1(list));
		  
		        t1.setName("Thread_1");
		        t2.setName("Thread_2");
		          
		        t1.start();
		        t2.start();     
		         
		        System.out.println("Size of list  = "+list.size());
			
			
			}
}
