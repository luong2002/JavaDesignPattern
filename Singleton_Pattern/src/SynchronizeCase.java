
public class SynchronizeCase {
	private static SynchronizeCase obj;
	
	private SynchronizeCase(){}		// ensure no outsider can instantiate 
	
	// synchronized forces every thread to wait its turn before it can enter the method
	public static synchronized SynchronizeCase getInstanceOfSingle() {
		if(obj == null)
		{
			obj = new SynchronizeCase();
		}
		return obj;
	}
	
	
	public void print() {
		System.out.println( "In SynchronizeCase print method" );
		
	}
}
