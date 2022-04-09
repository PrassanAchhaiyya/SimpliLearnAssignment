package myPackage;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSet {

	public static void main(String[] args) {
		//sets do not store duplicate values
		//Hash set does not store duplicate values
		/*
		HashSet<Integer> data= new HashSet<Integer>();
		data.add(200);
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(1000);
		
		for(var x:data)
			System.out.println(x);

		}
		*/
		//tree set displays in ascending order
		TreeSet<Integer> data= new TreeSet<Integer>();
		data.add(200);
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(1000);
		
		for(var x:data)
			System.out.println(x);

		}

}
