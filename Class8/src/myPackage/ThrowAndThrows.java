package myPackage;

public class ThrowAndThrows {
	//throw is used within a method
	/*
	public static int division(int a, int b)
	{
		if(b==0)
			throw new ArithmeticException("catch this");
		else
			return a/b;
	}
	*/
	//throws is used along with the method signature,can have multiple exceptions
	public static int division(int a, int b) throws ArithmeticException
	{
			return a/b;
	}

	public static void main(String[] args) {
		try {
		System.out.println(division(1,0));
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
