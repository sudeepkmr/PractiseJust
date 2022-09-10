package sessionfile;

import java.io.File;
import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Name of file to be checked:");
		String check=sc.nextLine();
		File obj=new File("src/sessionfile/"+check);
		if(obj.exists())
		{
			System.out.println("File Name="+obj.getName());
			System.out.println("File Pathname=" +obj.getAbsolutePath());
			System.out.println("Writabel+="+obj.canWrite());
			System.out.println("Readable+="+obj.canRead());
			System.out.println("File in Bytes="+obj.length());
			
		}
		else
		{
			System.out.println("File not Exist!!");
		}

	}

}
