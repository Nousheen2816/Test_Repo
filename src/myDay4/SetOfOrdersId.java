//write another program for above orders and find orders with lowest id ; highest order id.

package myDay4;
import java.util.Comparator;
import java.util.HashSet;
public class SetOfOrdersId {

		String id;
		int price;
		SetOfOrdersId  (String id,int price)
		{
			this.id=id;
			this.price=price;
			
		}
		public String getId() {
			return id;
		}
		 public String toString() 
			{
				return "  [ "+id + " , " + price +" ]";
			}
		 public static void main(String args[])
			{
			 HashSet<SetOfOrdersId > set1=new HashSet<SetOfOrdersId >(); 
			 SetOfOrdersId s1=new SetOfOrdersId("290", 500);
			 SetOfOrdersId s2=new SetOfOrdersId("290", 550);
			 SetOfOrdersId s3=new SetOfOrdersId("291", 600);
			 SetOfOrdersId s4=new SetOfOrdersId("292", 1200);
			 SetOfOrdersId s5=new SetOfOrdersId("293", 550);
			 SetOfOrdersId s6=new SetOfOrdersId("294", 1200);
			 SetOfOrdersId s7=new SetOfOrdersId("295", 900);
			 set1.add(s1);  
			 set1.add(s2);  
			 set1.add(s3);  
			 set1.add(s4);  
			 set1.add(s5);  
			 set1.add(s6);  
			 set1.add(s7);
			 
			 for(SetOfOrdersId b:set1)
			 {
				 System.out.println("Order :" + b);
			 }
			 SetOfOrdersId o1 = set1.stream().min(Comparator.comparing(SetOfOrdersId::getId)).get();//returns min of id
			 System.out.println("Product with Minimum price : " + o1);
			 SetOfOrdersId o2 = set1.stream().max(Comparator.comparing(SetOfOrdersId::getId)).get();//return max of id
			 System.out.println("Product with Maximum price : " + o2);

			}		 

}
