//Java Program to Initialize the Instance Variables of Employee Class, Using Parameterized Constructor


package myDay2;

public class ParaConstructor {
		public String name,company;
	   private int salary;
	   private int id;

	   public ParaConstructor (String empName,String empcomp) {
	      name = empName;
	      company=empcomp;
	   }
	   public void setDetails(int empSal,int empid) {
	      salary = empSal;
	      id=empid;
	   }

	   public void printEmp() {
	      System.out.println("Name  : " + name );
	      System.out.println("ID  : " + id );
	      System.out.println("Salary : " + salary);
	      System.out.println("Company : " + company );
	   }

	   public static void main(String args[]) {
		   ParaConstructor emp = new ParaConstructor("Nousheen","nisum");
	      emp.setDetails(20000,20);
	      emp.printEmp();
	   }

}
