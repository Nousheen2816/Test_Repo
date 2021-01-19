package myDay4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class DistinctProducts 
{
	 public DistinctProducts(String pName, int pPrice, String pId) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	 {
	
	Scanner sc = new Scanner(System.in);
   System.out.println("Enter size of the list");
    int n = Integer.parseInt(sc.next());
    ArrayList<Product> list = new ArrayList<>();
    for(int i=1;i<=n;i++){
        System.out.println("Enter Product "+i+" Name");
        String pName = sc.next();
        System.out.println("Enter Product "+i+" Price");
        int pPrice = Integer.parseInt(sc.next());
        System.out.println("Enter Product "+i+" Id");
        String pId = sc.next();

        list.addAll((Collection<? extends Product>) new DistinctProducts(pName,pPrice,pId));
    }

    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i).name+" "+list.get(i).price+" "+list.get(i).id);
    }

    sc.close();
}

}
