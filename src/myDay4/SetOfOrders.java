//create a set of order objects having properties [ id, price ] as below and find out the orders with highest and lowest price values.

package myDay4;

import java.util.Comparator;
import java.util.HashSet;

public class SetOfOrders {
	
		String id;
		int price;
		SetOfOrders  (String id,int price)
		{
			this.id=id;
			this.price=price;
			
		}
		public Integer getPrice() {
			return price;
		}
		 public String toString() 
			{
				return "  [ "+id + " , " + price +" ]";
			}
		 public static void main(String args[])
			{
			 HashSet<SetOfOrders > set=new HashSet<SetOfOrders >(); 
			 SetOfOrders s1=new SetOfOrders("290", 500);
			 SetOfOrders s2=new SetOfOrders("290", 550);
			 SetOfOrders s3=new SetOfOrders("291", 600);
			 SetOfOrders s4=new SetOfOrders("292", 1200);
			 SetOfOrders s5=new SetOfOrders("293", 550);
			 SetOfOrders s6=new SetOfOrders("294", 1200);
			 SetOfOrders s7=new SetOfOrders("295", 900);
			 set.add(s1);  
			 set.add(s2);  
			 set.add(s3);  
			 set.add(s4);  
			 set.add(s5);  
			 set.add(s6);  
			 set.add(s7);
			 
			 for(SetOfOrders b:set)
			 {
				 System.out.println("Order :" + b);
			 }
			 
			 SetOfOrders o1 = set.stream().min(Comparator.comparingInt(SetOfOrders::getPrice)).get();//returns min of price
			 System.out.println("Product with Minimum price : " + o1);
			 SetOfOrders o2 = set.stream().max(Comparator.comparingInt(SetOfOrders::getPrice)).get();//return max of price
			 System.out.println("Product with Maximum price : " + o2);


			
			}
		 
}
		 
