package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferreadereg2 {

	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader  (new InputStreamReader(System.in));
		System.out.println("Enter ur name");
		String name=br.readLine();
		System.out.println("My name is : " +name);
		int age=Integer.parseInt(br.readLine());
		System.out.println("My age is : " +age);
		float marks=Float.parseFloat(br.readLine());
		System.out.println("My marks is : " +marks);
		

	}

}
