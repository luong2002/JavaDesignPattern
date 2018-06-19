package abstractFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		if( item.equals( "cheese" )) {
			pizza = new CheesePizza( factory );
			pizza.setName( "New York Style Cheese Pizza" );
		}else if( item.equals( "veggie" )) {
			pizza = new VeggiePizza( factory );
			pizza.setName( "New York Style Veggie Pizza" );
		}else if( item.equals( "clam" )) {
			pizza = new ClamPizza( factory );
			pizza.setName( "New York Style Clam Pizza" );
		}else if( item.equals( "pepperoni" )) {
			pizza = new PepperoniPizza( factory );
			pizza.setName( "New York Style Pepperoni Pizza" );
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
