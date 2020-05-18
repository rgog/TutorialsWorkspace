package multithreadingPackage;

import java.util.concurrent.TimeUnit;

class Summation1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		summation();
	}
	public void summation(){
		long a=0;
		for (int i=0; i<=10000;i++) {
			for (int j=0; j<=10000;j++) {
				a++;
			}	
		}
		System.out.println("Sum1 is : "+ a);
	}
	
}

class Summation2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		summation();
	}
	public void summation(){
		long a=2;
		for (int i=0; i<=10000;i++) {
			for (int j=0; j<=10000;j++) {
				a++;
			}	
		}
		System.out.println("Sum2 is : "+ a);
	}
	
}
	


public class ThreadDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		Summation1 sum1 = new Summation1();
		sum1.summation();
		Summation2 sum2 = new Summation2();
		sum2.summation();
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in milliseconds: " + timeElapsed);
		
		startTime = System.currentTimeMillis();
		Thread t1 = new Thread(new Summation1());
		Thread t2 = new Thread(new Summation2());
		t1.run();
		t2.run();
		endTime = System.currentTimeMillis();
		timeElapsed = endTime - startTime;
		System.out.println("Execution time in milliseconds: " + timeElapsed);
	}
}
