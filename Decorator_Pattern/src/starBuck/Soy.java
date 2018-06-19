package starBuck;

public class Soy extends Condiments{

	Coffee myCoffee;
	
	public Soy( Coffee cof ) {
		myCoffee = cof;
	}
	
	@Override
	public String getDescription() {
		return myCoffee.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return myCoffee.cost() + .11;
	}

}
