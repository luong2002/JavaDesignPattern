package abstractFactory;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);   // item is a type of pizza
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
