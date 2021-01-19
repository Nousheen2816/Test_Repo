package myDay2;

public class ConstructorChain {
	     
	    public ConstructorChain(){
	        System.out.println("Im a  default constructor...");
	    }
	    public ConstructorChain(int i){
	        this();
	        System.out.println("Im a single parameter constructor...");
	    }
	    public ConstructorChain(int i,int j){
	        this(j);
	        System.out.println("Im a double parameter constructor...");
	    }
	     
	    public static void main(String a[]){
	    	ConstructorChain cc = new ConstructorChain(10,20);
	    }

}
