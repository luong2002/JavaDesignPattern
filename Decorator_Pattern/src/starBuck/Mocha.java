package starBuck;

public class Mocha extends Condiments{

	Coffee myCoffee;
	
	public Mocha( Coffee cof ) {
		myCoffee = cof;
	}
	
	@Override
	public String getDescription() {
		return myCoffee.getDescription() + " , Mocha";
	}

	@Override
	public double cost() {
		return myCoffee.cost() + .77;
	}

}
