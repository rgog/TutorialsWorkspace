package multithreadingPackage;

import multithreadingPackage.objectsForDemo.Person;

public class BlockedStatesDemo{
	public static void printThreadState(Thread threadToCheck) {
		System.out.println("Thread \"" + threadToCheck.getName() + "\" is in the \"" + threadToCheck.getState() + "\" state.");
	}
	public static void main(String[] args) {
		Person person = new Person("Rajat", "Blogger", "Ireland");
		Thread t1 = new Thread(person);
		t1.setName("FirstThread");
		Thread t2 = new Thread(person);
		t2.setName("SecondThread");
		t1.start();
		t2.start();
//		for(int i=0; i<=10000; i++) {
//			for(int j=0; j<=10000; j++) {
//				
//			}
//		}
//		printThreadState(t1);
	}
}
