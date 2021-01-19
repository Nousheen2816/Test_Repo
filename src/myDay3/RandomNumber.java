//Write a program to generate a 6 digit random number

package myDay3;
import java.util.Random;
public class RandomNumber {
	public static void main(String[] args) 
    {
        Random ra = new Random();
        int minRange = 100000, maxRange= 999999;
        int res = ra.nextInt(maxRange - minRange) + minRange;
        System.out.println("A 6 digit random number generated is " +res);
        
    }

}
