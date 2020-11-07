package beverage.making;

public class BeverageMaker {
	public void makeBeverage(MakeBeverage makeBeverage) {
		makeBeverage.make();
	}
	
	public static void main(String[] args) {
		BeverageMaker beverageMaker = new BeverageMaker();
		MakeCoffee makeCoffee = new MakeCoffee();
		MakeTea makeTea = new MakeTea();
		MakeMojito makeMojito = new MakeMojito();
		beverageMaker.makeBeverage(makeTea);
		beverageMaker.makeBeverage(makeCoffee);
		beverageMaker.makeBeverage(makeMojito);
	}
}
