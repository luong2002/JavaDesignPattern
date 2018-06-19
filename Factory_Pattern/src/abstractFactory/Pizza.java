package abstractFactory;

public abstract class Pizza {
	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	// prepare() is different for each pizza made from different region
	abstract void prepare();
	
	// These methods stay the same for different type of pizza
	void bake() {
		System.out.println( "Bake for 25 minutes at 350" );
	}
	
	void cut() {
		System.out.println( "Cutting the pizza into diagonal slices" );
	}
	
	void box() {
		System.out.println( "Place pizza in offical PizzaStore box" );
	}
	
	void setName( String name ) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		
	}
}
