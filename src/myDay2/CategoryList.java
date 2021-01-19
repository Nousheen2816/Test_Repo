//Using Arrays, categorize the list of products as below.(Use Inheritance, constructors, access modifiers(private & public))

package myDay2;
import java.util.Scanner;

public class CategoryList {

		public static void main(String[] args) {
			Home h=new Home();
			Fashion f=new Fashion();
			Jewellary j=new Jewellary();
			h.home();
			f.fashion();
			j.jewellery();
			
		
		}

	}

	class Category{
		String[] category = {"Home","Fashion","Jewellery"};
	}

	class Home extends Category
	{

		private String[] home = {"1.Furniture","2.Kitchen","3.Electronic Appliances"};
		
		void home() 
		{
			System.out.println("Home items");
			for(int i=0;i<home.length;i++) 
			{
				System.out.println(home[i]);
			}
			
			
		}
		
	}

	class Fashion extends Category
	{
	    String[] fashion = {"Men","Women","Kids"};
		private String[] collections = {"1.Dresses","2.Footwear","3.Goggles","4.HandBags"};
			void fashion()
			{
			System.out.println("\nFashion Items");
			for(int i=0;i<collections.length;i++)
			{
				System.out.println(collections[i]);
			}
		}
	}

	class Jewellary extends Category{
		private String[] jewellery= {"1.Necklaces","2.Chains","3.Earrings","4.Bracelets"};
		void jewellery()
		{
			System.out.println("\nJewellery items");
			for(int i=0;i<jewellery.length;i++)
			{
				System.out.println(jewellery[i]);
			}
		}
	}


