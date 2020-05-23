package multithreadingPackage;

class Thread1 implements Runnable{
	@Override
	public void run() {
		System.out.println("We are inside the run function."
				+ "The thread \"" + Thread.currentThread().getName() + "\" is in the \"" + Thread.currentThread().getState() + "\" state.");
	}
}

public class BasicThreadLifeCycleDemo{
	public static void printThreadState(Thread threadToCheck) {
		System.out.println("The thread \"" + threadToCheck.getName() + "\" is in the \"" + threadToCheck.getState() + "\" state.");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		printThreadState(t1);
		t1.start();
		printThreadState(t1);
		for(int i=0; i<=10000; i++) {
			for(int j=0; j<=10000; j++) {
				
			}
		}
		printThreadState(t1);
	}
}
