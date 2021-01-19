//Write a Java Program to  display some basic information of car and bus using inheritance concept

package myDay2;
class Vehicle
{
    String clr;
    int sts;
    
    void display()
    {
        System.out.println("Color and Seats : " + clr + "  " + sts);
    }
}

class Bus extends Vehicle
{
	
	int wgt;
    void display1()
    {
        System.out.println("Weight : " + wgt);
      
    }
   
    
    void details()
    {
        System.out.println("Color,Seats,Weight = " + clr+ " "+sts+" "+wgt);
    }
}
class Car extends Bus
{
}

public class InheritVehicle {
	 public static void main(String args[])
	    {
	        
	        Vehicle v1 = new Vehicle();
	        Bus b1 = new Bus();
	        Car c1=new Car();
	        
	        
	        v1.clr = "Red";
	        v1.sts = 50;
	        System.out.println("Details of Vehicle : ");
	        v1.display();
	        System.out.println();
	        
	     
	         b1.clr = "Blue";
	         b1.sts = 80;
	         b1.wgt = 900;
	         System.out.println("Deatils of Bus: ");
	         b1.display();
	         b1.display1();
	         System.out.println();
	         
	         c1.clr = "Black";
	         c1.sts = 6;
	         c1.wgt = 400;
	         System.out.println("Deatils of Car: ");
	         c1.display();
	         c1.display1();
	         System.out.println();
	         

	    }
}
