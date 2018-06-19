package Ducky;

public class FlyWithNoWing implements FlyBehavior{

	@Override
	public void flying() {
		System.out.println( "I can't fly" );
	}

}
