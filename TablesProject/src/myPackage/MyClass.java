package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		try
		{
			System.out.println("Enter any number");
			int n=Integer.parseInt(obj.nextLine());

			for(int i=1;i<=10;i++){
				System.out.println(n+" x "+i+" ="+(n*i));
			}
			obj.nextLine();
		}catch(NumberFormatException ex) {
			System.out.println("Please enter numbers only");
			obj.nextLine();
		}

	}

}
