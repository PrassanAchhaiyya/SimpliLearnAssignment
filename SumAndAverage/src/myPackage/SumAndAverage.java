package myPackage;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		int temp,sum=0,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++) {
			temp=sc.nextInt();
			sum+=temp;
		}
		avg=sum/5;
		System.out.println("SUM ="+sum+" AVG ="+avg);
	}

}
