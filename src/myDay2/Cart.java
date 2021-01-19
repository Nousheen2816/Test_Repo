//Write a program to create multiple 'Item' objects which has variables like itemName,itemValue and itemId. Validate the values of these variables and build an order summary with itemsCount and orderTotal within the 'Cart' class.


package myDay2;

public class Cart {
	String itemName;
	int itemValue;
	int itemId;
	int total;
	 public static void main(String[] args) 
	 {
		 Cart t1=new Cart();
		 Cart t2=new Cart();
		 Cart t3=new Cart();
		 Cart t4=new Cart();
		 Cart t5=new Cart();
		 t1.itemId=1;
		 t1.itemName="Chair";
		 t1.total=2000;
		 t2.itemId=2;
		 t2.itemName="Table";
		 t2.total=5000;
		 t3.itemId=3;
		 t3.itemName="TV";
		 t3.total=30000;
		 t4.itemId=4;
		 t4.itemName="Mobile";
		 t4.total=20000;
		 t5.itemId=5;
		 t5.itemName="Camera";
		 t5.total=35000;
		 Cart a[]= {t1,t2,t3,t4,t5};		 
		 for(int i=1;i<=5;i++)
		 {
			System.out.println("Order Summary with item id "+a[i].itemId); 
		 }
	 }

}
