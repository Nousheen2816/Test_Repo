package myDay4;



public class HandleIllegalAccessExcep {
	int m;
	public void setMarks(int marks) {
	      if(marks < 0 || marks > 100)
	         throw new IllegalArgumentException(Integer.toString(marks));
	      else
	         m = marks;
	   }
	 public static void main(String[] args)
	 {
		 HandleIllegalAccessExcep t=new HandleIllegalAccessExcep();
	           try {
	              t.setMarks(101);
	              throw new IllegalAccessException("value must be non-negative and below 100");
	            }
	            catch(IllegalAccessException i)
	           {
	               System.out.println("out of range encouneterd. Want to continue");
	               
	          }
	 }
}

	     


