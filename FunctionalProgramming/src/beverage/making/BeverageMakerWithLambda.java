package beverage.making;

public class BeverageMakerWithLambda {
	public void makeBeverage(MakeBeverage makeBeverage) {
		makeBeverage.make();
	}
	
	public static void main(String[] args) {
		BeverageMakerWithLambda beverageMakerWithLambda = new BeverageMakerWithLambda();
		MakeBeverage action = () -> System.out.println("Make whatever beverage I want!");
		beverageMakerWithLambda.makeBeverage(action);
	}
}
