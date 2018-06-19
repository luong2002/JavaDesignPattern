package Ducky;

public class Quack implements QuackBehavior{

	@Override
	public void quacking() {
		System.out.println( "I can quack very loud" );
	}

}
