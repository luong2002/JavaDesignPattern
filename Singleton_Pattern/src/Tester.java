
public class Tester {
	public static void main( String[] args ) {
		SynchronizeCase o = SynchronizeCase.getInstanceOfSingle();
		o.print();
		
		EagerCase a = EagerCase.getInstance();
		a.print();
		
	}
}
