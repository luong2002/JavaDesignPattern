package Ducky;

public abstract class Duck {
	private FlyBehavior tryToFly;
	private QuackBehavior tryToQuack;
	
	public void setFlyBehavior( FlyBehavior fly ) {
		tryToFly = fly;
	}
	
	public void setQuackBehavior( QuackBehavior quack ) {
		tryToQuack = quack;
	}
	
	public void swim( Duck d ) {
		System.out.println( d.getClass().getSimpleName() + " is swiming");
	}
	
	public void flying() {
		tryToFly.flying();
	}
	
	public void quacking() {
		tryToQuack.quacking();
	}
	
	public abstract void display();
}
