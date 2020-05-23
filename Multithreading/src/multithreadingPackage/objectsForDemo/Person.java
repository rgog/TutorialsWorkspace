package multithreadingPackage.objectsForDemo;

public class Person implements Runnable {
	private String name;
	private String job;
	private String address;
	
	public Person(String name, String job, String addr){
		this.name = name;
		this.job = job;
		this.address = addr;
	}
	/*Non-synchronized version.
	To convert this to synchronized block, replace method declaration with
	public synchronized void printPersonDetails(){ */
	public synchronized void printPersonDetails() {
		String threadName = Thread.currentThread().getName();
		System.out.println("-------------------------------");
		System.out.println(threadName + " holds lock?- " + Thread.currentThread().holdsLock(this));
//		if(threadName.equals("FirstThread")) {
//			Thread.currentThread().yield();
//		}
		System.out.println(threadName + " Name - " + this.name);
		System.out.println(threadName + " Job - " + this.job);
		System.out.println(threadName + " Address - " + this.address);
		System.out.println("-------------------------------");
	}
	
	@Override
	public void run() {
		printPersonDetails();
	}
}
