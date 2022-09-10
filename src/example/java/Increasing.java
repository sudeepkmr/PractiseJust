package example.java;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked it is increasing or not :");
		int n=sc.nextInt();
		Check a=new Check();
		if(Check.isIncreasing(n))
		{
			System.out.println("The number is Increasing");
		}
		else
		{
			System.out.println("Not increasing number");
		}
		
		

	}

}
 class Check{
	 public static boolean isIncreasing(int num) {
		 String str=Integer.toString(num);
		 char digit;
		 
		 boolean flag=true;
		 for(int i=0;i<str.length()-1;i++)
		 {
			 digit=str.charAt(i);
			 if(digit>str.charAt(i+1))
			 {
				 flag=false;
				 break;
			 }
		 }
		 return flag;
	 }
 }