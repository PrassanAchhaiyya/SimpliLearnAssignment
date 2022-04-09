package myOtherPackage;

import myPackage.MyBaseClass;

public class MyOtherPackageDerivedClass extends MyBaseClass {
	public void MyOtherPackageDerivedClassMethod()
	{
		a=1;
		b=10;//cannot be accessed
		c=15;
		d=20;//cannot be accessed
	}

}
class MyOtherPackageOtherClass {
	public void MyOtherPackageOtherClassMethod() {
		MyBaseClass obj = new MyBaseClass();
		obj.a=5;
		obj.b=10;//cannot be accessed
		obj.c=30;//cannot be accessed
		obj.d=50;//cannot be accessed
	}
}
