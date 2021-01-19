//Write a program to access static method in parent class from child class


package myDay2;

class Stat{
	static void stud()
	{
	System.out.println("I'm parent static method");
	}
	void display()
	{
	System.out.println("I'm parent class method ");
	}
	}
	class Hello extends Stat
	{
	static void stud()
	{
	System.out.println("I'm child class static method");
	}
	void display()
	{
	System.out.println("I'm child class method");
	}
	}

public class StaticMethod {
	public static void main(String[] argus)
	{
	Stat s=new Hello();
	
	s.display();
	s.stud();
	}
	}

