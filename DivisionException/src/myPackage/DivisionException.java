package myPackage;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a,b,total;
		try {
			System.out.println("Enter first number");
			a=Integer.parseInt(obj.nextLine());
			System.out.println("Enter second number");
			b=Integer.parseInt(obj.nextLine());
			total=a/b;
			System.out.println("ANS : "+total);
			obj.nextLine();
			
		}catch(ArithmeticException ex) {
			System.out.println("Cannot divide by zero");
		}catch(NumberFormatException ex) {
			System.out.println("Enter only numbers");
		}finally {
			obj.nextLine();
		}

	}

}
