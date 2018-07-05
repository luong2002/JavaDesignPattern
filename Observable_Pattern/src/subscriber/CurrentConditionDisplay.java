package subscriber;

public class CurrentConditionDisplay implements Observer, DisplayInfo{

	private float temperature;
	private float humidity;
	private float pressure;
	private float previousTemperature;
	private WeatherData observerable;
	
	public CurrentConditionDisplay( WeatherData obs ) {
		observerable = obs;
		obs.registerObserver( this );
	}
	
	@Override
	public void update() {    // this is from Observer
		previousTemperature = temperature;
		temperature = observerable.getTemperature();
		humidity = observerable.getHumidity();
		if( previousTemperature != temperature)
			display();
		else
			System.out.println( "Current conditions: The temperature hasn't changed" );
	}

	@Override
	public void display() {    // this is from DisplayInfo
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	
}
