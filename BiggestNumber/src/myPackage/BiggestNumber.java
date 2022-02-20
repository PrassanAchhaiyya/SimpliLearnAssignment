package myPackage;

import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		int max=0;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++) {
			temp=sc.nextInt();
			if(temp>max) {
				max=temp;
			}
		}
		System.out.println("MAX : "+max);		
	}

}
