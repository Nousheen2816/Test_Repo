//Write a Program to handle No such method exception.


package myDay4;

public class HandleNoMethodExcep {
	public static void main(String[] args) {

		Student s = new Student();
		s.name();
		try {
		Student.class.getMethod("company");
		}
		catch(NoSuchMethodException e) 
		{
			e.printStackTrace();
			
		}

	}
	
}
