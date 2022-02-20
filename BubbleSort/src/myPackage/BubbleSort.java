package myPackage;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers..");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
        for (int i = 0; i < 5-1; i++)
        {
            for (int j = 0; j < 5-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
