package myPackage;
class ThreadsDemo extends Thread{
	public void run() {
		for(int i=0;i<19;i++) {
			System.out.print(i);
		}
	}
}

public class ThreadingConcept {

	public static void main(String[] args) {
		ThreadsDemo obj =new ThreadsDemo();
		ThreadsDemo obj2 =new ThreadsDemo();
		obj.start();
		obj2.start();

	}

}
