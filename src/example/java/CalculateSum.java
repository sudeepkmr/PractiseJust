package example.java;

import java.util.Scanner;

class Findsum{	
	public int calculate(int n){
		int sum=0;
		for(int i=0; i<=n; i++)
		{
			 if(i%5==0 || i%3==0)
			 {
				 System.out.println(i);
				 sum+=i;
			 }
		}
	return sum;
	}

}
public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number sum required :");
		int n=sc.nextInt();
		Findsum a=new Findsum();
		System.out.println("Sum will be =="+a.calculate(n));
	

	}
}


