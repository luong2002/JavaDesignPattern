package simpleFactory;

public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore( SimplePizzaFactory fact ) {
		factory = fact;
	}
	
	public Pizza orderPizza( String type ) {
		Pizza piz = null;
		piz = factory.createPizza(type);
		piz.prepare();
		piz.bake();
		piz.cut();
		piz.box();
		
		return piz;
	}
}
