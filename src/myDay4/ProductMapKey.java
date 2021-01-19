// Create a class which should hold products using a Map using id as key. Write a method which takes Product object as input and stores in the products collection.
//Product[ id, name, price]
//Write a method to print the products.
//Write a method which returns the list of ids that map contains.


package myDay4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Product
{
    int id;
    String name ;
    int price;
    
     Product(String name1,int p1)
     {
    	// id=id1;
         name=name1;
         price=p1;
     }
 
}
public class ProductMapKey {
	public static void main(String[] args) {  
		 HashMap<Integer, Product> map=new HashMap<Integer, Product>(); 
		  Product i1=new Product("Cheese",200);
		  Product i2=new Product("Butter",400);
		  Product i3=new Product("Tomato",300);
		  Product i4=new Product("Bread",800);
		  	map.put(1,i1);
	        map.put(3,i2);
	        map.put(2,i3);
	        map.put(4,i4);
	       Iterator i=map.entrySet().iterator();//print the products.
	        while(i.hasNext())
	    	{
	    		Map.Entry record=(Map.Entry)i.next();  //will give next (Key, Value) pair
	    		Product j=(Product)record.getValue();
	                    System.out.println( " Product : [ "+ record.getKey()+ " "+j.name+" "+j.price+" "+"]");
	    	}
	        
	        Set ids = map.keySet();//returns the list of ids that map contains.
	        System.out.println("All ids present in the map are : " + ids);
	        
	}  
}
