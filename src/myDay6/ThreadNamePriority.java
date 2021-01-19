//Write a program to get the following things  Current thread name, Current Thread Priority,Set the name to current Thread,Set the priority to the current thread


package myDay6;


class Thread1 extends Thread 
{ 

 public void run() 
 {  
     System.out.println("Fetching current thread name.."); 
     System.out.println(Thread.currentThread().getName()); 
     System.out.println("Fetching current thread priority.."); 
     System.out.println(Thread.currentThread().getPriority()); 
 } 
} 

public class ThreadNamePriority { 
 public static void main (String[] args) 
 { 
     Thread1 t1 = new Thread1(); 
     Thread1 t2 = new Thread1(); 
       
     t1.start(); 
     t2.start(); 
     t1.setName("Hello.."); 
     t2.setName("World..");  
     t1.setPriority(4);
     t2.setPriority(2);
     
     System.out.println("After changing thread names and priorites"); 
     System.out.println("New Thread 1 name:  " + t1.getName()); 
     System.out.println("New Thread 2 name: " + t2.getName());
     System.out.println("New Thread 1 name:  " + t1.getPriority()); 
     System.out.println("New Thread 2 name: " + t2.getPriority());
 } 
} 


