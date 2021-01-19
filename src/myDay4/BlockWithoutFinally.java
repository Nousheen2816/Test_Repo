package myDay4;

public class BlockWithoutFinally {
	public static void main(String[] args) {  
        try  
        {  
        int n=50/0; 
        }  
        catch(Exception e)  
        {  
            System.out.println("Division by zero is not possible");  
        }  
    }  
	

}
