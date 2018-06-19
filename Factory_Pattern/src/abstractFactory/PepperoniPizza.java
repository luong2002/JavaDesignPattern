package abstractFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory factory;
	
	public PepperoniPizza( PizzaIngredientFactory fact ) {
		factory = fact;
	}
	
	@Override
	void prepare() {
		System.out.println( "Preparing " + getName() );
		dough = factory.createDough();
		sauce = factory.createSauce();
		pepperoni = factory.createPepperoni();
	}

}
