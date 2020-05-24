package multithreadingPackage;

class BroadbandAccount{
	private double dataInGb;
	private double moneyInEuros;
	public BroadbandAccount(double data, double money){
		this.dataInGb = data;
		this.moneyInEuros = money;
	}
	public synchronized void addData() {
		System.out.println("Current balance = " + this.moneyInEuros);
		if(moneyInEuros<20) {
			System.out.println("You don't have enough balance. Waiting for you to add money");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Adding data and deducting money");
		this.moneyInEuros -= 20;
		this.dataInGb += 20;
		System.out.println("Remaining Balance = " + this.moneyInEuros + ". Remaining data = " + this.dataInGb);
	}
	public synchronized void addMoney() {
		System.out.println("Adding 20 Euros");
		this.moneyInEuros += 20;
		System.out.println("Added. New balance = " + this.moneyInEuros);
		notify();
	}
}

public class WaitNotifyImplementationDemo{

	public static void main(String[] args) {
		BroadbandAccount account = new BroadbandAccount(1, 10);
		new Thread() {
			public void run() {
				account.addData();
			}
		}.start();
		new Thread() {
			public void run() {
				account.addMoney();
			}
		}.start();
	}
}
