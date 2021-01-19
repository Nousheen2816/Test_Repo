//Build List of Order objects having properties [ id, status ] as below and then filter out and return list of orders whose status are 'PENDING';.

package myDay4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfOrders {
	String id;
	String status;
	 ListOfOrders (String id,String status)
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
			
			ArrayList<ListOfOrders> list= new ArrayList<>();
			list.add( new ListOfOrders ("0345" , "COMPLETED"));
			list.add( new ListOfOrders ("0456" , "COMPLETED"));
			list.add( new ListOfOrders ("0789" , "IN-TRNASIT"));
			list.add( new ListOfOrders ("0346" , "PENDING"));
			list.add( new ListOfOrders ("0347" , "PENDING"));
			list.add( new ListOfOrders ("0348" , "CANCELLED"));
			list.add( new ListOfOrders ("0678" , "PENDING"));
			
			for( ListOfOrders o:list)
			{
				if(o.status=="PENDING") 
				{
					System.out.println("Order :" + o);
				}
			}
			
			 for(int i=0;i<list.size();i++)
			 {
		            if("PENDING".equals(list.get(i).status))
		            {
		                list.remove(list.get(i));
		              
		            }
			 
		     }
			 for( ListOfOrders z:list)
				{
				 System.out.println(z);
				}
	 
		}
}
