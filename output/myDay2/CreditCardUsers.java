//Create different types of credit cards and register users to single or multiple credit cards? (Constructors, access modifiers(private & public))

package myDay2;
import java.util.Scanner;

public class CreditCardUsers {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		String[] banks = {"Axis","Kotak","HDFC"};
		System.out.println("Availabe credit cards:");
		for(int i=0;i<banks.length;i++) {
			System.out.println(banks[i]);
		}
		System.out.println("Enter 1 for HDFC 2 for SBI 3 for CITI :");
		int n = ab.nextInt();
		System.out.println("Enter Name : ");
		String name = ab.next();
		System.out.println("Enter Age : ");
		int age = ab.nextInt();
		
		switch(n) {

		case 1:
		Axis axis = new Axis(name,age);
		axis.generateCardInfo();
		break;
		case 2: Kotak kotak = new Kotak(name,age);
		kotak.generateCardInfo();
		break;
		case 3:HDFC hdfc = new HDFC(name,age);
		hdfc.generateCardInfo();
		break;
		
		}
		ab.close();	
	}
}

class Axis{
	String name;
	int age;
	private Long cardNumber=40987236122L;
	Axis(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void generateCardInfo() {
		System.out.println("Axis Bank CREDIT CARD\n"+"Name : "+name+"\nAge :"+age+"\n Creditcard number : "+cardNumber);
	}
	
}

class Kotak{
	String name;
	int age;
	private Long cardNumber=987654321087L;
	Kotak(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void generateCardInfo() {
		System.out.println("Kotak Bank CREDIT CARD\n"+"Name : "+name+"\nAge :"+age+"\nCreditcard number : "+cardNumber);
	}
	
}
class HDFC{
	String name;
	int age;
	private Long cardNumber=352716897201L;
	HDFC(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void generateCardInfo() {
		System.out.println("HDFC Bank CREDIT CARD\n"+"Name: "+name+"\nAge:"+age+"\nCreditcard number : "+cardNumber);
	}
}
