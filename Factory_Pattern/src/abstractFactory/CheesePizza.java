package abstractFactory;

public class CheesePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza( PizzaIngredientFactory fact ) {
		ingredientFactory = fact;
	}
	
	@Override
	void prepare() {
		// here is where the magic happes...asks the factory to produce a needed ingredients to create CheesePizza
		System.out.println( "Preparing " + getName() );
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}

}
