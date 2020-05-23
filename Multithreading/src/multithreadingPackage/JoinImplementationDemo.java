package multithreadingPackage;

class Address implements Runnable {
	private String address;
	public String getAddress() {
		return address;
	}
	public Address(){
		
	}
	@Override
	public void run() {
		this.address = "Dublin";
	}
}

class Job implements Runnable {	
	private String job;
	public String getJob() {
		return job;
	}
	public Job() {
		
	}
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.job = "Software Developer"; 
	}
}

class Person{
	private String name;
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job.getJob() + ", address=" + address.getAddress() + "]";
	}
	private Job job;
	private Address address;
	public Person(String name, Address address, Job job) {
		this.name = name;
		this.address = address;
		this.job = job;
	}
}

public class JoinImplementationDemo{

	public static void main(String[] args) {
		Address address = new Address();
		Thread tAddress = new Thread(address);
		Job job = new Job();
		Thread tJob = new Thread(job);
		tJob.start();
		tAddress.start();
		try {
			tAddress.join();
			tJob.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Person person = new Person("Rajat", address, job);
		System.out.println(person.toString());
	}

}
