package file;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class fileeg {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\JAVA\\test.txt//");
		if(f.createNewFile())
		{
			System.out.println("File is Created ...");
		}
		else
		{
			System.out.println("File already Exist ...");
		}
		Path p=Paths.get("D:\\JAVA\\test.txt//");
		boolean status;
		status=Files.isWritable(p);
		System.out.println("File is Writtable " +status);
		String path=f.getAbsolutePath();
		System.out.println("Absolute path:" +path);
		String path1=f.getPath();
		System.out.println("path:" +path1);
		String path2=f.getCanonicalPath();
		System.out.println("Canonical path:" +path2);
		
		

	}


	}



