//Java program to create a directory or a folder

package myDay5;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {

        String dir = "/D:/test";

        File file = new File(dir);

        // true if the directory was created, false otherwise
        if (file.mkdirs()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Failed to create directory!");
        }

    }

}
