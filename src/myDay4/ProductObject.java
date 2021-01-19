// Write a program to display first five product objects whose prices are less than 10$ using For Loop.
//Sort all product objects based on the price using comparable
// Write a method to check if given product exists in the above list. return true or false based on product id.

package myDay4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.text.DecimalFormat;
public class ProductObject implements Comparable <ProductObject>{
	int id;
	int amount=10;
	int rupee; 
	String name;
	int price;
	//DecimalFormat f = new DecimalFormat("##.##");
	ProductObject (int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int compareTo(ProductObject m) 
    { 
        return this.price - m.price; 
    } 
	public String toString() 
	{
		return " [ "+id + " , "+name+ ", " + price +" ]";
	}
	static boolean checks(int id,ArrayList<ProductObject> a)
	{
        boolean check = false;
        for(int i=0;i<a.size();i++)
        {
            if(id==(a.get(i).id))
            {
               check = true;
               break;
            }
            else 
            {
               check = false;
            }
        }
        return check;
    }
	
	public static void main(String args[])
	{
		
		ArrayList<ProductObject> list= new ArrayList<>();
		DecimalFormat f = new DecimalFormat("##.##");
		int amount=10;
		int rupee = amount * 70;
		System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
		list.add( new ProductObject (1,"Cheese",800));
		list.add (new ProductObject (2,"Butter",1000));
		list.add (new ProductObject (3,"Tomato",200));
		list.add (new ProductObject (4,"Eggs",300));
		list.add (new ProductObject (5,"Bread",400));
		list.add (new ProductObject (6,"Milk",200));
		list.add (new ProductObject (7,"Apple",200));
		list.add (new ProductObject (8,"Banana",800));
		for( ProductObject o:list)
		{
			if(o.price<=rupee) 
			{
				System.out.println("Product :" + o);
			}
		}
		 Collections.sort((List<ProductObject>) list); //Sort all product objects based on the price using comparable
		 System.out.println("Sorted ArrayList in Ascending order : "+ list); 
		 boolean res = checks(6,list);//Checks if the product exists or not
	        System.out.println("Is the product available ?" +res);
	   }

}
