package myPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryLinear {

	public static void main(String[] args) {
		//LINEAR SEARCH
		/*
		List<Integer> data = new ArrayList<Integer>();
		data.add(60);
		data.add(50);
		data.add(110);
		data.add(20);
		data.add(99);
		data.add(612);
		boolean isFound=false;
		System.out.println("Enter number to be found");
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		for(var z : data )
		{
			if(x==z) {
				isFound=true; 
				break;
			}
		}
		if(isFound) {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
		*/
		//Linear search to find duplicate numbers
		/*
		int[] arr= new int[] {6,5,3,22,1,6,44,67,81,6};
		LinearSearchDuplicate(arr);
		*/
		//BINARY SEARCH data set needs to be sorted
		int[] arr=new int[] {22,25,33,37,41,44,47,56,58,59};
		BinarySearch(arr,99);

	}
	public static void LinearSearchDuplicate(int[] arr) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to be found");
		int x=sc.nextInt();
		boolean isFound=false;
		String position="Found at ";
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				if(!isFound)
				position += " "+Integer.toString(i);
				if(isFound) {
					position+=" & "+Integer.toString(i);
				}
				isFound=true;
			}
		}
		if(isFound) {
			System.out.println(position);
		}else {
			System.out.println("Not found");
		}
		sc.close();
	}
	public static void BinarySearch(int[] arr,int x) {
		int l=0,r=arr.length-1;
		boolean isFound=false;
		while(l<=r) {
			int m=(l+r)/2;
			//m=l +(r-1)/2 to prevent overflow check gfg.com
			if(arr[m]==x)
				isFound=true;
			if(arr[m]<x)
				l=m+1;
			else
				r=m-1;
		}
		System.out.println(l+"  "+r);
		if(isFound)
			System.out.println("Number found");
		else
			System.out.println("Not found");
		
	}

}
