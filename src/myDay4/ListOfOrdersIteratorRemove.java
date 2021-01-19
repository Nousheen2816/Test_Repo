package myDay4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfOrdersIteratorRemove {

	String id;
	static String status;
	 ListOfOrdersIteratorRemove  (String id,String status)
	{
		this.id=id;
		this.status=status;
		
	}
	 public String toString() 
		{
			return "  [ "+id + " , " + status +" ]";
		}
	 public String getStatus()
	 {
		 return status;
	 }
	 public static void main(String args[])
		{
			
			List<ListOfOrdersIteratorRemove> list= new ArrayList<>();
			list.add( new ListOfOrdersIteratorRemove ("0345" , "COMPLETED"));
			list.add( new ListOfOrdersIteratorRemove ("0456" , "COMPLETED"));
			list.add( new ListOfOrdersIteratorRemove ("0789" , "IN-TRNASIT"));
			list.add( new ListOfOrdersIteratorRemove ("0346" , "PENDING"));
			list.add( new ListOfOrdersIteratorRemove ("0347" , "PENDING"));
			list.add( new ListOfOrdersIteratorRemove ("0348" , "CANCELLED"));
			list.add( new ListOfOrdersIteratorRemove ("0678" , "PENDING"));
			
			for( ListOfOrdersIteratorRemove o:list)
			{
				if(o.status=="PENDING") 
				{
					System.out.println("Order :" + o);
				}
			}
			  /*for(int i=0;i<ListOfOrders.size();i++){
		            if("PENDING".equals(ListOfOrders.get(i).status)){
		            	ListOfOrders.remove(ListOfOrders.get(i));
		    }*/
			
	      
		}
		      }
	 


