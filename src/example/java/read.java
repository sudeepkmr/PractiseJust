package example.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class read {

	public static void main(String[] args) {
		//char[] sat= {'a','p','p','l','e'};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to count:");
		String sat=sc.next();
		System.out.println(Countnoof.count(sat));

	}

}

class Countnoof{
	static Map<Character, Integer> count(String sat){
		Map<Character,Integer> num=new HashMap<>();
		char[] arr=sat.toCharArray();
		for(char c:arr)
		{
			if(num.containsKey(c)) {
				num.put(c, num.get(c)+1);
			}
		
		else {
			num.put(c, 1);
		}
		
		
	}
	return num;
	
}
}