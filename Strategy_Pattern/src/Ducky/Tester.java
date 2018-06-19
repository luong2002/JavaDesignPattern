package Ducky;

public class Tester {
	public static void main(String[] args) {
		Duck duckyMomo = new DuckyMomo();
		duckyMomo.display();
		duckyMomo.flying();
		duckyMomo.quacking();
		
		System.out.println( "Something happens and ..." );
		duckyMomo.setFlyBehavior( new FlyWithSonicPower() );
		duckyMomo.flying();
	}
}
