//Write a java Program to display Colleges and student marks info where each subject marks should not be visible to outside

package myDay2;
import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks {
	 String[] myArray = new String[3];
	private String subject;
	private int marks;
	StudentMarks(String subject,int marks){
		
		this.subject = subject;
		this.marks = marks;
		
	}
	public void display() {
		String[] myArray={"MJCET","BVRIT","CBIT"};
		for( int i = 0; i <myArray.length; i++)
		{
		    String collegeName = myArray[i];
		     System.out.println("College Name : "+collegeName+"\t\tsubject Name : "+subject);
		}
	     
		
	}

	public static void main(String[] args) {
		StudentMarks s1 = new StudentMarks("Web Services",95);
		StudentMarks s2 = new StudentMarks("Java Programming",85);
		StudentMarks s3 = new StudentMarks("Big Data",90);
		s1.display();
		s2.display();
		s3.display();

	}

}
