package myDay5;
import java.io.*;

public class Deserialization {
	 public static void main(String args[]){  
		  try{   
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.txt"));  
		  Employee e=(Employee)in.readObject();   
		  System.out.println(e.name+ " " +e.id+" "+e.comp);   
		  in.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
}
