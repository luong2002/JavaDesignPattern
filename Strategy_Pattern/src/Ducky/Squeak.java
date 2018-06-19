package Ducky;

public class Squeak implements QuackBehavior {

	@Override
	public void quacking() {
		System.out.println( "I cannot quack, but sqeaking is fine" );
	}

}
