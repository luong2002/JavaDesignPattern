package starBuck;

public class Whip extends Condiments{

	Coffee myCoffee;
	
	public Whip( Coffee cof ) {
		myCoffee = cof;
	}
	
	@Override
	public String getDescription() {
		return myCoffee.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return myCoffee.cost() + .77;
	}

}
