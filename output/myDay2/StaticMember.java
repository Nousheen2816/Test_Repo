//write a program to show case the static members and their behaviors with class instances

package myDay2;

 class StatMem {
	int x;
	static int y;//static variable
	public void myMethod1()
	{
		x=10;
		System.out.println("Hi,I'm a normal method with value : "+ x);
	}
	public  static void myMethod2()
	{
		y=20;
		System.out.println("Hi,I'm a static method with value : "+ y);
	}
	static class Test
	{
		public static String res="Hi,I'm a static class";
	}
}
public class StaticMember {
	 public static void main(String args[])
	   {
		 StatMem s1=new StatMem();
		 StatMem s2=new StatMem();
		 s1.myMethod1();
		 s2.myMethod2();
		 System.out.println(StatMem.Test.res);
	   } 
}
