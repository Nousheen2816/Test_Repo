//	Write a program for find armstrong number


package MyDay1;

public class Armstrong {
	int a;
	int findArmstrong(int x,int y)
	{
	if(x!=0)
	{
		a=x%10;
		y=y+(a*a*a);
		x/=10 ;
		return findArmstrong(x,y);
	}
	return y;
	}
	public static void main(String[] arg)
	{
	Armstrong A=new Armstrong();
	int arm;
	System.out.println("Armstrong numbers are");
	for(int num=1;num<1000;num++)
	{
	arm=A.findArmstrong(num,0);
	if(arm==num)
	      System.out.println(num);
	}
	}
}
