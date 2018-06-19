
public class EagerCase {
	private static EagerCase obj = new EagerCase();		// instantiate here EAGERLY
	
	private EagerCase() {}
	
	public static EagerCase getInstance() {
		return obj;   // already got an instance, just return it.
	}
	
	public void print() {
		System.out.println( "In EagerCase print method" );
	}
}
