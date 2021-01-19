//Java Program to read a zip file and access all files from it. Here, we will have a zip file, read files from it and print file names

package myDay5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
public class ReadZipFile
{
	public static void main(String[] args)
	{
        String src = "/C:/Sprint1/src/myDay2.zip";  
        String dest = "/C:/Sprint1/output";
        unzip(src, dest);
    }

    private static void unzip(String zipFilePath, String destDir)
    {
        File dir = new File(destDir);//creates output directory
        if(!dir.exists()) dir.mkdirs();
        FileInputStream fis;
        byte[] buffer = new byte[1024];
        try 
        {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null)
            {
                String fileName = ze.getName();
                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                new File(newFile.getParent()).mkdirs();//create directories for sub directories in zip
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) 
                {
                	fos.write(buffer, 0, len);
                }
                fos.close();
                zis.closeEntry();
                ze = zis.getNextEntry();
               
            }
           
            zis.closeEntry();
            zis.close();
            fis.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }

}
