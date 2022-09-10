package sessionfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		try {
			File read=new File("src/sessionfile/demo.txt");
			Scanner rt=new Scanner(read);
			int i =0;
			while(rt.hasNext())
			{
				i++;
				System.out.println(i+ "::"+rt.nextLine());
			}
		}
		/*catch(IOException e){
			e.printStackTrace();
			
		}*/
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
