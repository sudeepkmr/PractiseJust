package example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorthashmap {

	public static void main(String[] args) {
		Map<String, Integer> v=new HashMap<>();
		v.put("kumar", 1);
		v.put("star", 2);
		v.put("car", 9);
		v.put("seat", 4);
		v.put("dam",3);
		
		change s1=new change();
		//System.out.println();
		System.out.println(s1.Changevalue(v));

	}

}
class change{
	List<Integer> list=new ArrayList<>();
	public List<Integer> Changevalue(Map<String, Integer> v)
	{
		for(Integer value:v.values())
		{
			list.add(value);
		}
		Collections.sort(list);
		return list;
	}
}
