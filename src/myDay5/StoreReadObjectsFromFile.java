//Write a program to store and read objects from a file

package myDay5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class StoreReadObjectsFromFile implements Serializable{
    
     String name;
     int id;
     String company;
     String designation;
     
    public StoreReadObjectsFromFile(String name, int id,String company, String designation){
        this.name = name;
        this.id = id;
        this.company=company;
        this.designation = designation;
    }
     
    public String toString(){
        return name +" "+id+" "+designation+" "+company;
    }
   
    public void storeObject(StoreReadObjectsFromFile emp)
    {        
       FileOutputStream fos = null;
       ObjectOutputStream oos = null;
       try 
       {
           fos = new FileOutputStream("C:/Sprint1/emp1.txt");
           oos = new ObjectOutputStream(fos);
           oos.writeObject(emp);
           oos.flush();
       } 
       catch (Exception e) 
       {
           e.printStackTrace();
       }         
   }

   public void displayObjects()
   {         
       InputStream is = null;
       ObjectInputStream ois = null;
       try 
       {
           is = new FileInputStream("C:/Sprint1/emp1.txt");
           ois = new ObjectInputStream(is);
           StoreReadObjectsFromFile emp = (StoreReadObjectsFromFile) ois.readObject();
           System.out.println(emp);
       } 
       catch (Exception e)
       {
           e.printStackTrace();
       } 
   }   


	  public static void main(String args[]) throws IOException,ClassNotFoundException{
		  StoreReadObjectsFromFile emp = new StoreReadObjectsFromFile("Nousheen",20,"nisum","Software Engineer");
	      emp.storeObject(emp);
	      emp.displayObjects();
	  }
	}

