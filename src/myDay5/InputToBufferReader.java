//Prepare program to convert input stream to reader or BufferedReader

package myDay5;

import java.io.*;

public class InputToBufferReader {
	public static void main(String a[]) throws IOException{
        
        InputStream is = null;
        System.out.println("Enter the input stream:");
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader bin= new BufferedReader(in);
        String str=bin.readLine();
        System.out.println("Using  BufferedReader : "+str);
        }
  }
