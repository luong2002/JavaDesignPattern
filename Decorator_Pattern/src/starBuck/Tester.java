package starBuck;

public class Tester {
	public static void main( String[] args ) {
		Coffee myCoffee = new Decaf();
		myCoffee = new Soy( myCoffee );
		myCoffee = new Whip( myCoffee );
		System.out.printf( "%s%s$%.2f", myCoffee.getDescription(), " costs ", myCoffee.cost());
	}
}
