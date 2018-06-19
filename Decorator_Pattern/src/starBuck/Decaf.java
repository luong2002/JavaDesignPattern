package starBuck;

public class Decaf extends Coffee{

	public Decaf() {
		setDescription( "Decaf" );
	}
	
	@Override
	public double cost() {
		return 1.11;
	}

}
