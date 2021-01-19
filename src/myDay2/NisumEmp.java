//Create a class parent class Nisum and subclass Employee. Access instance variables of Nisum from Employee without using super keyword.

package myDay2;

public class NisumEmp {
	public String name;
	private String company;
	 public int salary;
	 private int id;
	 public void set(String empcomp,int empid )
	 {
		 this.company=empcomp;
		 this.id=empid;
	 }
	 public void display()
	 {
		 System.out.println("Name of the employee :"+name);
		 System.out.println("Salary of the employee :"+salary);
		 System.out.println("Id of the employee :"+id);
		 System.out.println("Company of the employee :"+company);
	 }
	 public static void main(String args[]) {
		  Emp e1 = new Emp();
		  e1.name="Nousheen";
		  e1.salary=20000;
	      e1.setEmp("nisum",20,"Softwar Engineer");
	      e1.displayEmp();
	   }

	  

}

class Emp extends NisumEmp
{
	private  String designation;
	 public void setEmp(String x,int y,String z )
	 {
		 set(x,y);
		 designation=z; 
	 }
	 public void displayEmp()
	 {
		 display();
		 System.out.println("Designation of the employee :"+designation);
	 }
	
}