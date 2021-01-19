//) Create a class UserDetails with variables like name,id,email,password,creditCard,creditCardbalance where in name,id,email of any user should be accessible to all but not creditcard and creditcardbalance

package myDay2;
import java.util.Scanner;
public class UserDetails {
	private String password;
	private long creditCard;
	private double creditCardbalance; 
	/* String[] myArray = new String[3];
		private String subject;
		private int marks;*/
		UserDetails(long creditCard,String password,double creditCardbalance){
			
			this.creditCard = creditCard;
			this.password=password;
			this.creditCardbalance =creditCardbalance;
			
		}

		public static void main(String[] args) {
			Scanner ab=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=ab.nextLine();
			System.out.println("Enter your EmailId");
			String email=ab.nextLine();
			System.out.println("Enter your ID");
			int id=ab.nextInt();
			
			
			UserDetails s1 = new UserDetails(234567890112L,"123ABCD",95000.28);
			UserDetails s2 = new UserDetails(345678901234L,"456MNO",85564.50);
			UserDetails s3 = new UserDetails(987654321230L,"789XYZ",90236.10);
			 System.out.println("Name : "+name+"\nEmail ID  : "+email+"\nID : "+id);
			

		}


}
