package example.java;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationdemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<15;i++)
		{
			list.add(i);
		}
		list.stream().filter(i->i%2==0).collect(Collector.tolist()).forEach(System.out::println)

	}

}
