package myDay2;

public class ConstructorOverload {

	 int a;
	    double b;
	    String  str;
	    public ConstructorOverload(int c,int d)
	    {
	        a=c+d;
	    }
	    public ConstructorOverload(double  c,double d)
	    {
	        b=c*d;
	    }
	    public ConstructorOverload(String n)
	    {
	        str=n;
	    }
	    public static void main(String[] args)
	    {
	    	ConstructorOverload res=new ConstructorOverload(2,3);
	    	ConstructorOverload res1=new ConstructorOverload(2.0,3.0);
	    	ConstructorOverload res2=new ConstructorOverload("Add and Mul");
	        System.out.println("Addition of 2 numbers is\t"+res.a);
	        System.out.println("Multiplication of 2 numbers is\t"+res1.b);
	        System.out.println(res2.str+" Are done successfully");
	}

}
