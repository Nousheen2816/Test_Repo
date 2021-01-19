package myDay5;
import java.io.*;

public class Serializtion { 
	 public static void main(String args[]) throws Exception{  
	  Employee e =new Employee("Nousheen",20,"Nisum");   
	  FileOutputStream eout=new FileOutputStream("C:\\Sprint1\\src\\myDay5\\emp.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(eout);  
	  out.writeObject(e);  
	  out.flush();   
	}  
	 }
