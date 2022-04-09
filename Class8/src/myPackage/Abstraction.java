package myPackage;

abstract class Salary{
	public int getPF(int basic) {
		return 12*basic/100;
	}
	
	public int getHRA(int basic) {
		return 40 * (basic/100);
	}
	public abstract int getBonus();
	public abstract int getCA();
}

class Infosys extends Salary{
	@Override
	public int getPF(int basic) {
		return basic*2;
	}

	@Override
	public int getBonus() {
		return 6000;
	}

	@Override
	public int getCA() {
		return 4000;
	}
	
}
class Cognizant extends Salary{

	@Override
	public int getBonus() {
		return 1500;
	}

	@Override
	public int getCA() {
		return 2000;
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		Salary obj;
		obj=new Infosys();
		System.out.println(obj.getPF(100));
		obj=new Cognizant();
		System.out.println(obj.getPF(100));

	}

}
