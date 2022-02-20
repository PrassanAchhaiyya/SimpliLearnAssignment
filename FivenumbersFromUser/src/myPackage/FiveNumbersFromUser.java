package myPackage;

import java.util.Scanner;

public class FiveNumbersFromUser {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five numbers");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		//using for loop
		System.out.println("FOR LOOP");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\nFOR EACH LOOP");
		for(int d:arr) {
			System.out.print(d+"  ");
		}
		sc.close();

	}

}
