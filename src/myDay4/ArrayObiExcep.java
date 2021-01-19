//Write a Program to get the ArrayIndexOutOfBoundException.

package myDay4;
import java.util.Scanner;

public class ArrayObiExcep {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = ab.nextInt();
		int a[]= new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the array values" + i + ":");
			a[i] = ab.nextInt();
		}
		System.out.println("Enter array index to get the value:");
		int index = ab.nextInt();
		ab.close();
		System.out.println("Value at " + index + " = " + a[index]);
	}
}
