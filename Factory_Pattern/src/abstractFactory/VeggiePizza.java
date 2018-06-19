package abstractFactory;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory factory;
	
	public VeggiePizza( PizzaIngredientFactory fact ) {
		factory = fact;
	}
	
	@Override
	void prepare() {
		System.out.println( "Preparing  " + getName() );
		Dough = factory.createDough();
		dough = factory.createDough();
		sauce = factory.createSauce();
		veggies = factory.createVeggies();
	}

}
