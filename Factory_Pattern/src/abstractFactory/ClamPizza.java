package abstractFactory;

public class ClamPizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza( PizzaIngredientFactory fact ) {
		ingredientFactory = fact;
	}
	
	@Override
	void prepare() {
		// here is where the magic happes...asks the factory to produce a needed ingredients to create CheesePizza
		System.out.println( "Preparing " + getName() );
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();		// if it is NY factory, clams will be fresh
		
	}

}