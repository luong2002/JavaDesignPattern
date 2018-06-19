package starBuck;

public class Espresso extends Coffee{

	public Espresso() {
		setDescription( "Espresso" );
	}
	
	@Override
	public double cost() {
		return 1.33;
	}

}
