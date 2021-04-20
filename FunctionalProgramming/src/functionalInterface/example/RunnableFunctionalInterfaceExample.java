package functionalInterface.example;

public class RunnableFunctionalInterfaceExample {
	public static void main (String[] args) {
		Thread threadWithAnonymousImplementation = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printing from anonymous inner class implementation");
			}
			
		});
		threadWithAnonymousImplementation.start();
		
		Thread threadWithLambdaImplementation = new Thread(() -> System.out.println("Printing from Lambda Implementation"));
		threadWithLambdaImplementation.start();
	}
}
