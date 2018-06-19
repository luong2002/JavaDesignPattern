package Ducky;

public class DuckyMomo extends Duck{

	public DuckyMomo() {
		setFlyBehavior( new FlyWithNoWing() );
		setQuackBehavior( new Quack() );
	}
	
	@Override
	// this.getClass() returns Ducky.DuckyMomo
	// this.getClass().getSimpleName() returns DuckyMomo
	public void display() {
		System.out.println( "I'm " + this.getClass().getSimpleName() );
	}

}
