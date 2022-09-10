package example.java;

import java.util.HashMap;
import java.util.Map;

public class Square {
	static Map<Integer, Integer> squarenum(Integer[] arr){
		Map<Integer,Integer> map=new HashMap<>();
		for(Integer n:arr)
		{
			map.put(n, n*n);
		}
		return map;
	}
	

	public static void main(String[] args) {
		Integer [] array= {1,2,3,4,5,6,7,0};
		System.out.println(squarenum(array));

	}

}
