//Create parametarized class in Java using Generics 

package myDay3;

class Box<T>
{
	private T t;
	public void add(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
}

public class ParaClsGen {
	public static void main(String[] args) 
	{
		Box<Integer> b1=new Box<Integer>();
		Box<String> b2=new Box<String>();
		b1.add(new Integer(20));
		b2.add(new String("Hello"));
	System.out.printf("Box representing an integer :%d\n",b1.get());
	System.out.printf("Box representing a string :%s",b2.get());
	}

}
