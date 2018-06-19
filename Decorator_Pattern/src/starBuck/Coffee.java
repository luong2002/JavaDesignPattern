package starBuck;

public abstract class Coffee {
	private String description;
	
	public Coffee() {
		description = "";
	}
	
	public void setDescription( String desc ) {
		description = desc;
	}
	
	public abstract double cost();
	
	public String getDescription() {
		return description;
	}
}
