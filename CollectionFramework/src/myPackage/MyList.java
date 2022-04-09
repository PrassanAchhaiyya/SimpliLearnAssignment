package myPackage;

import java.util.Collection;
import java.util.LinkedList;

public class MyList {

	public static void main(String[] args) {
		//LinkedList with raw data type
		LinkedList raw = new LinkedList();
		raw.add(5);
		raw.add(20);
		raw.add(30);
		raw.add("madara");
		
		//Generic LinkedList
		LinkedList<Integer> data = new LinkedList<Integer>();
		data.add(3);
		data.add(4);
		data.add(54);
		data.add(6);
		data.add(77);
		
		System.out.println(data.get(1));
		System.out.println(data.size());
		System.out.println(data.contains(4));
		System.out.println(data.indexOf(54));
		
		//ArrayList

	}

}
