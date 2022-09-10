package sessionfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner sc;
		File obj=new File("src/sessionfile/trial.txt");
		int sum=0,n;
		//System.out.println("Enter the integers:");
		//String s=sc.nextLine();
		
		try
		{
			sc=new Scanner(obj);
			System.out.println("Reading from trial.txt");
			while(sc.hasNext())
			{
				String temp=sc.nextLine();
				StringTokenizer st=new StringTokenizer(temp," ");
				while(st.hasMoreTokens())
				{
					
					n=Integer.parseInt(st.nextToken());
					System.out.println(n);
					sum=sum+n;
				}
				
				System.out.println("Sum of the integer is :" +sum);
				//sc.close();
			}
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
			

	}

}
