package myPackage;

import java.util.HashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		//HashMap stores data randomly
		/*
		HashMap<String,Integer> data= new HashMap<String,Integer>();
		
		data.put("English", 91);
		data.put("Maths",100);
		data.put("TFCS",84 );
		data.put("Maths", 99);
		
		System.out.println(data.get("Maths"));
		System.out.println(data.containsKey("English"));
		System.out.println(data.size());
		
		for(var x:data.keySet())
			System.out.println(x);
			
		*/
		//Tree map stores in order
		TreeMap<String,Integer> obj=new TreeMap<String,Integer>();
		obj.put("English", 91);
		obj.put("Maths",100);
		obj.put("TFCS",84 );
		obj.put("Maths", 99);
		
		for(var x:obj.keySet())
			System.out.println(x);
			

	}

}
