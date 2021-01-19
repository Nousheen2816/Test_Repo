//By writing java thread program generate dead lock situation with join()method

package myDay6;

public class DeadLockJoin {
	private static final Object o = new Object();

        static 
        {
            MyThread thread = new MyThread();
            thread.start();

            try {
                thread.join();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        static class MyThread extends Thread
        {
            
            public void run ()
            {
                System.out.println("Thread in static block is still executing");
                o.getClass();//stopped here
            }
        }
        public static void main (String[] args)//main being itself a thread is in wait until the thread in static block completes its execution
        {
            System.out.println("all is well.");
        }

        
        

    }


