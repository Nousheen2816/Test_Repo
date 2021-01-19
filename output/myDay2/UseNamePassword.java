//Write a util class to check whether given username and password are valid or not? Username should be email id format. Password should have alphabets,digits and special characters.


package myDay2;
import java.util.Scanner;
import java.util.regex.*;
public class UseNamePassword {
	 static boolean isValidUsername(String username) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return username.matches(regex);
	   }
	 static boolean isValidPassword(String password) 
	    {  
	        String regex = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$"; 
	        Pattern p = Pattern.compile(regex); 
	        if (password == null) 
	        { 
	            return false;
	        }   
	        Matcher m = p.matcher(password); 
	        return m.matches(); 
	        }
	 public static void main(String args[])
	   {
		 Scanner ab=new Scanner(System.in);
		 String username,password;
		 System.out.println("Enter the username : ");
		 username=ab.nextLine();
		 System.out.println("Enter the password : ");
		 password=ab.nextLine();
		 
		// System.out.println("The E-mail ID is: " + username);
	      System.out.println("Is the above username valid? " + isValidUsername(username));
	      System.out.println("Is the above password valid? " +isValidPassword(password));
	    }
}
