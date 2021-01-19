package myDay6;

public class UserThreadOutputUnPredict extends thread
{
	public void run()
	{
		System.out.println("Hii,I'm a run method implemented by runable interface");
	}


	public static void main(String [] args)
	 {
		UserThreadOutputUnPredict t1=new UserThreadOutputUnPredict();
		UserThreadOutputUnPredict t2=new UserThreadOutputUnPredict();
		t1.start();
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		}
	

}
