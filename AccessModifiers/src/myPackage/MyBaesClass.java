package myPackage;

public class MyBaseClass {
	
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void myBaseClassMethod() {
		a=5;
		b=10;
		c=15;
		d=20;
	}

}
class MyDerivedClass extends MyBaseClass{
	public void myDerivedClassMethod()
	{
		a=5;
		b=10;//cannot be accessed
		c=15;
		d=20;
	}
}
class MyOtherClass{
	public void myOtherClassMethod() {
		MyBaseClass ob=new MybaseClass();
		ob.a=5;
		ob.b=10;//cannot be accessed
		ob.c=20;
		ob.d=40;
	}
}
