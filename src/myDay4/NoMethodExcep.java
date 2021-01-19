//Write a Program to get the No Such method exception.

package myDay4;

class Student {

	public void name() {
		System.out.println("John");
	}
	
	/*public void company () {
 		System.out.println("nisum");
 	}*/
}
public class NoMethodExcep {

		public static void main(String[] args) {

			Student s = new Student();
			s.name();
			s.company();

		}

	}

	
