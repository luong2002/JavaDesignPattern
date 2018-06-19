package Ducky;

public class DuckyTurbo extends Duck{

	public DuckyTurbo() {
		setFlyBehavior( new FlyWithSonicPower() );
		setQuackBehavior( new Squeak() );
	}
	
	@Override
	public void display() {
		System.out.println( "I'm " + this.getClass().getSimpleName() );
	}

}
