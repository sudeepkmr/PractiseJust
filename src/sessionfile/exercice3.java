package sessionfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) throws FileNotFoundException {
		File st=new File("src/sessionfile/que3.txt");
		Scanner scan=new Scanner(st);
		int line=0,word=0,charcount=0;
		while(scan.hasNext()) {
			line++;
			String[] space=scan.nextLine().split(" ");
			word=word+space.length;
			for(int i=0;i<space.length;i++)
			{
				charcount=charcount+space[i].length();
			}
			
		}
		System.out.println("Number of lines:"+line);
		System.out.println("Number of words:"+word);
		System.out.println("Numbver of char:"+charcount);

	}

}
